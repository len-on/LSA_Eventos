package br.com.api.back.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "administrador")
public class AdministradorModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_adm;

    @OneToOne
    @JoinColumn(name = "usuario_id_usuario")
    @JsonProperty("usuarioAdministradorModelo")
    private UsuarioModelo usuarioAdministradorModelo;

    public Long getId_adm() {
        return id_adm;
    }

    public void setId_adm(Long id_adm) {
        this.id_adm = id_adm;
    }

    public UsuarioModelo getUsuarioAdministradorModelo() {
        return usuarioAdministradorModelo;
    }

    public void setUsuarioAdministradorModelo(UsuarioModelo usuarioAdministradorModelo) {
        this.usuarioAdministradorModelo = usuarioAdministradorModelo;
    }

    
    
}
