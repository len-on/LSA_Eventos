package br.com.api.back.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.back.modelo.InscricaoModelo;
import br.com.api.back.repositorio.InscricaoRepository;

@Service
public class InscricaoServico {
    
    @Autowired
    private InscricaoRepository inscricaoRepository;

    //Metodo para listar inscrições
    public Iterable<InscricaoModelo> listar() {
        return inscricaoRepository.findAll();
    }
}
