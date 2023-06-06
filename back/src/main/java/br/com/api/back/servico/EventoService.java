package br.com.api.back.servico;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.api.back.modelo.EventoModelo;
import br.com.api.back.repositorio.EventoRepository;

public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public EventoModelo salvar(EventoModelo eventoModelo) {
		
		return eventoRepository.save(eventoModelo);
	}

    
    
}
