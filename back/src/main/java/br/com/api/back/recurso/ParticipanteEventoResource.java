package br.com.api.back.recurso;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.back.modelo.ParticipanteEventoModelo;
import br.com.api.back.repositorio.ParticipanteEventoRepository;

@RestController
@RequestMapping("/participanteEvento")
public class ParticipanteEventoResource {
    
    @Autowired
    ParticipanteEventoRepository participanteEventoRepository;

    @GetMapping("/listar")
    public Iterable<ParticipanteEventoModelo> listar() {
        return participanteEventoRepository.findAll();
    }
}
