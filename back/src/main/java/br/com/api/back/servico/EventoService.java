package br.com.api.back.servico;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.api.back.modelo.EventoModelo;
import br.com.api.back.repositorio.EventoRepository;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public EventoModelo salvar(EventoModelo eventoModelo) {
		
		return eventoRepository.save(eventoModelo);
	}

  public EventoModelo buscarEventoPeloCodigo(Long codigo) {
		Optional<EventoModelo> eventoModeloSalvoOpt = this.eventoRepository.findById(codigo);
		
		if (!eventoModeloSalvoOpt.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		
		EventoModelo eventoModeloSalvo = eventoModeloSalvoOpt.get();
		
		
		return eventoModeloSalvo;
	}

  public EventoModelo atualizar(Long codigo, EventoModelo eventoModelo) {
		EventoModelo eventoModeloSalvo = buscarEventoPeloCodigo(codigo);
		eventoModeloSalvo = eventoModelo;
		return eventoRepository.saveAndFlush(eventoModeloSalvo);
		
	}

    //Metodo para remover produtos
    public void remover(Long codigo){

        eventoRepository.deleteById(codigo);
    }
    
}
