package br.com.api.back.recurso;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.back.evento.RecursoCriadoEvent;
import br.com.api.back.modelo.ParticipanteInscricaoModelo;
import br.com.api.back.repositorio.ParticipanteInscricaoRepository;


@RestController
@RequestMapping("/inscricoes")
public class ParticipanteInscricaoResource {
    
    @Autowired
    private ParticipanteInscricaoRepository participanteInscricaoRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public Iterable<ParticipanteInscricaoModelo> listar() {
        return participanteInscricaoRepository.findAll();
    }  

    @PostMapping
    public ResponseEntity<ParticipanteInscricaoModelo> criar(@Valid @RequestBody ParticipanteInscricaoModelo participanteInscricaoModelo, HttpServletResponse response) {
        ParticipanteInscricaoModelo participanteInscricaoModeloSalva = participanteInscricaoRepository.save(participanteInscricaoModelo);

        publisher.publishEvent(new RecursoCriadoEvent(this, response, participanteInscricaoModeloSalva.getId_participante_inscricao()));

        return ResponseEntity.status(HttpStatus.CREATED).body(participanteInscricaoModeloSalva);
    }

    public ResponseEntity<?> buscarPeloCodigo(@PathVariable Long codigo) {
        Optional<ParticipanteInscricaoModelo> participanteInscricaoModelo = this.participanteInscricaoRepository.findById(codigo);
        return participanteInscricaoModelo.isPresent() ? ResponseEntity.ok(participanteInscricaoModelo) : ResponseEntity.notFound().build();
    }
}
