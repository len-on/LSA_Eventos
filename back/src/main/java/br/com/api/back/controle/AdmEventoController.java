package br.com.api.back.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.back.modelo.AdmEventoModelo;
import br.com.api.back.servico.AdmEventoServico;

@RestController
@CrossOrigin(origins = "*")
public class AdmEventoController {
    
    @Autowired
    private AdmEventoServico admEventoServico;

    @GetMapping("/listarAdmEventos")
    public Iterable<AdmEventoModelo> listar(){
        return admEventoServico.listar();
    }
}
