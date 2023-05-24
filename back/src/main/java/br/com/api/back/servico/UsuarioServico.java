package br.com.api.back.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.back.modelo.RespostaModelo;
import br.com.api.back.modelo.UsuarioModelo;
import br.com.api.back.repositorio.UsuarioRepository;

@Service
public class UsuarioServico {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RespostaModelo rm;

    //Metodo para listar todos os usuarios
    public Iterable<UsuarioModelo> listar() {
        return usuarioRepository.findAll();
    }
}
