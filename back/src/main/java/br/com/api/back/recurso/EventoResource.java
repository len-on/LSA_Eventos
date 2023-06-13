package br.com.api.back.recurso;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

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
    public ResponseEntity<List<EventoModelo>> criar(@Valid @RequestBody String eventoJson, HttpServletResponse response) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    TypeReference<List<EventoModelo>> typeReference = new TypeReference<List<EventoModelo>>() {};
    List<EventoModelo> eventoModeloList = objectMapper.readValue(eventoJson, typeReference);
    
    List<EventoModelo> eventoModeloSalvoList = this.eventoRepository.saveAll(eventoModeloList);
    
    List<Long> eventoIds = eventoModeloSalvoList.stream().map(EventoModelo::getId_evento).collect(Collectors.toList());
    publisher.publishEvent(new RecursoCriadoEvent(this, response, eventoIds));

    return ResponseEntity.status(HttpStatus.CREATED).body(eventoModeloSalvoList);
}

    @GetMapping("/{codigo}")
    public ResponseEntity<?> buscarPeloCodigo(@PathVariable Long codigo) {
        Optional<EventoModelo> eventoModelo = this.eventoRepository.findById(codigo);
        return eventoModelo.isPresent() ? ResponseEntity.ok(eventoModelo) : ResponseEntity.notFound().build();
    }

}
