package br.com.api.back.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.back.modelo.EventoModelo;
import br.com.api.back.servico.EventoServico;

@RestController
@CrossOrigin(origins = "*")
public class EventoController {
    
    @Autowired
    private EventoServico eventoServico;

    @GetMapping("/listarEventos")
    public Iterable<EventoModelo> listar(){
        return eventoServico.listar();
    }
}
