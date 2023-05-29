package br.com.api.back.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.back.modelo.AdmEventoModelo;
import br.com.api.back.repositorio.AdmEventoRepository;

@Service
public class AdmEventoServico {
    
    @Autowired
    private AdmEventoRepository admEventoRepository;

    //Metodo para listar adm eventos
    public Iterable<AdmEventoModelo> listar() {
        return admEventoRepository.findAll();
    }
}
