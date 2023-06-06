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
import br.com.api.back.modelo.EventoModelo;
import br.com.api.back.repositorio.EventoRepository;

@RestController
@RequestMapping("/eventos")
public class EventoResource {
    
    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping("/listar")
    public Iterable<EventoModelo> listar() {
        return eventoRepository.findAll();
    }

    @PostMapping("/criar")
    public ResponseEntity<EventoModelo> criar(@Valid @RequestBody EventoModelo eventoModelo, HttpServletResponse response){
        EventoModelo eventoModeloSalva = eventoRepository.save(eventoModelo);

        // URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}").buildAndExpand(eventoModeloSalva.getId_evento()).toUri();
        // response.setHeader("Location", uri.toASCIIString());
        publisher.publishEvent(new RecursoCriadoEvent(this, response, eventoModeloSalva.getId_evento()));

        return ResponseEntity.status(HttpStatus.CREATED).body(eventoModeloSalva);
    }
    
    @GetMapping("/{codigo}")
    public ResponseEntity<?> buscarPeloCodigo(@PathVariable Long codigo) {
        Optional<EventoModelo> eventoModelo = this.eventoRepository.findById(codigo);
        return eventoModelo.isPresent() ? ResponseEntity.ok(eventoModelo) : ResponseEntity.notFound().build();
    }

}
