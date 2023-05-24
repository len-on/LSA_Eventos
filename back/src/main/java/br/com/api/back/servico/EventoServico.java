package br.com.api.back.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.back.modelo.EventoModelo;
import br.com.api.back.repositorio.EventoRepository;

@Service
public class EventoServico {
    
    @Autowired
    private EventoRepository eventoRepository;

    //Metodo para listar todos os eventos
    public Iterable<EventoModelo> listar() {
        return eventoRepository.findAll();
    }

}
