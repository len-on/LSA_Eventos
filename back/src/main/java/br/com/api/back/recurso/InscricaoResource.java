package br.com.api.back.recurso;

import java.net.URI;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.api.back.modelo.InscricaoModelo;
import br.com.api.back.repositorio.InscricaoRepository;


@RestController
@RequestMapping("/inscricao")
public class InscricaoResource {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @GetMapping
    public Iterable<InscricaoModelo> listar() {
        return inscricaoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<InscricaoModelo> criar(@Valid @RequestBody InscricaoModelo inscricaoModelo, HttpServletResponse response){
        InscricaoModelo inscricaoModeloSalva = inscricaoRepository.save(inscricaoModelo);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}").buildAndExpand(inscricaoModeloSalva.getId_inscricao()).toUri();
        response.setHeader("Location", uri.toASCIIString());

        return ResponseEntity.created(uri).body(inscricaoModeloSalva);
    }
    
    public ResponseEntity<?> buscarPeloCodigo(@PathVariable Long codigo) {
        Optional<InscricaoModelo> inscricaoModelo = this.inscricaoRepository.findById(codigo);
        return inscricaoModelo.isPresent() ? ResponseEntity.ok(inscricaoModelo) : ResponseEntity.notFound().build();
    }

    // @PutMapping("/{codigo}")
	// public ResponseEntity<InscricaoModelo> atualizar(@PathVariable Long codigo, @Valid @RequestBody InscricaoModelo inscricaoModelo) {
	
	// 	try {
	// 		InscricaoModelo inscricaoSalva = inscricaoServico.atualizar(codigo, inscricaoModelo);
	// 		return ResponseEntity.ok(inscricaoSalva);
	// 	} catch (IllegalArgumentException e) {
	// 		return ResponseEntity.notFound().build();
	// 	}
	// }
    
}
