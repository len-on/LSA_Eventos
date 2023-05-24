package br.com.api.back.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.back.modelo.UsuarioModelo;
import br.com.api.back.servico.UsuarioServico;


@RestController
@CrossOrigin(origins="*")
public class UsuarioController {
    
    @Autowired
    private UsuarioServico usuarioServico;



    @GetMapping("/listarUsuarios")
    public Iterable<UsuarioModelo> listar(){
        return usuarioServico.listar();
    }

}
