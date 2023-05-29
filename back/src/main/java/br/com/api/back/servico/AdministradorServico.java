package br.com.api.back.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.back.modelo.AdministradorModelo;
import br.com.api.back.repositorio.AdministradorRepository;

@Service
public class AdministradorServico {
    
    @Autowired
    private AdministradorRepository administradorRepository;

    //Metodo para listar todos os ADM
    public Iterable<AdministradorModelo> listar() {
        return administradorRepository.findAll();
    }
}
