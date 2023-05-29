package br.com.api.back.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.back.modelo.ParticipanteModelo;
import br.com.api.back.repositorio.ParticipanteRepository;

@Service
public class ParticipanteServico {
    
    @Autowired
    private ParticipanteRepository participanteRepository;

    //Metodo para listar todos os participantes
    public Iterable<ParticipanteModelo> listar() {
        return participanteRepository.findAll();
    }

}
