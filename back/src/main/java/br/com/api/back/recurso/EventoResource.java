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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import br.com.api.back.evento.RecursoCriadoEvent;
import br.com.api.back.modelo.EventoModelo;
import br.com.api.back.repositorio.EventoRepository;
import br.com.api.back.servico.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventoResource {
    
    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private EventoService eventoService;

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

    @PutMapping("/atualizar/{codigo}")
    public ResponseEntity<List<EventoModelo>> atualizar(@PathVariable List<Long> codigo, @RequestBody String eventoJson, HttpServletResponse response) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        TypeReference<List<EventoModelo>> typeReference = new TypeReference <List<EventoModelo>>() {};
        List<EventoModelo> eventoModelo = objectMapper.readValue(eventoJson, typeReference);
        List<EventoModelo> eventoModeloSalvo = eventoRepository.findAllById(codigo);
        eventoModeloSalvo = eventoRepository.save(eventoModelo);
            List<Long> eventoIds = eventoModeloSalvo.stream().map(EventoModelo::getId_evento).collect(Collectors.toList());
    publisher.publishEvent(new RecursoCriadoEvent(this, response, eventoIds));
        return ResponseEntity.status(HttpStatus.OK).body(eventoModeloSalvo);
        
        
        
        // try {
        //     EventoModelo eventoModelo = objectMapper.readValue(eventoJson, typeReference);
        //     eventoModelo = eventoService.atualizar(codigo, eventoModelo);
        //     return ResponseEntity.ok(eventoModelo);
        // } catch (JsonProcessingException e) {
        //     return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        // }

        
	}


    @DeleteMapping("/remover/{codigo}")
    public void remover(@PathVariable Long codigo){
        eventoService.remover(codigo);
    }

}
