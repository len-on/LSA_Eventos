package br.com.api.back.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.back.modelo.ParticipanteInscricaoModelo;
import br.com.api.back.servico.ParticipanteInscricaoServico;

@RestController
@CrossOrigin(origins = "*")
public class ParticipanteInscricaoController {
    
    @Autowired
    private ParticipanteInscricaoServico participanteInscricaoServico;

    @GetMapping("/listarParticipanteInscricao")
    public Iterable<ParticipanteInscricaoModelo> listar(){
        return participanteInscricaoServico.listar();
    }
}
