package br.com.api.back.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.back.modelo.ParticipanteModelo;
import br.com.api.back.servico.ParticipanteServico;

@RestController
@CrossOrigin(origins = "*")
public class ParticipanteController {
    
    @Autowired
    private ParticipanteServico participanteServico;
    
    @GetMapping("/listarParticipantes")
    public Iterable<ParticipanteModelo> listar(){
        return participanteServico.listar();
    }
}
