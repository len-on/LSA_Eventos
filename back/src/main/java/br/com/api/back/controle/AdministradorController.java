package br.com.api.back.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.back.modelo.AdministradorModelo;
import br.com.api.back.servico.AdministradorServico;

@RestController
@CrossOrigin(origins = "*")
public class AdministradorController {

    @Autowired
    private AdministradorServico administradorServico;

    @GetMapping("/listarAdm")
    public Iterable<AdministradorModelo> listar(){
        return administradorServico.listar();
    }
    
}
