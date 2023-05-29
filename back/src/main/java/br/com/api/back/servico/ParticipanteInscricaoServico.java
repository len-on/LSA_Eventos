package br.com.api.back.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.back.modelo.ParticipanteInscricaoModelo;
import br.com.api.back.repositorio.ParticipanteInscricaoRepository;

@Service
public class ParticipanteInscricaoServico {
    
    @Autowired
    private ParticipanteInscricaoRepository participanteInscricaoRepository;

    //Metodo para listar todos os participantes no evento
    public Iterable<ParticipanteInscricaoModelo> listar() {
        return participanteInscricaoRepository.findAll();
    }
}

