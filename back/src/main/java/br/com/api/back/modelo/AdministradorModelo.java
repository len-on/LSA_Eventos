package br.com.api.back.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "administrador")
@Getter
@Setter
@EqualsAndHashCode
public class AdministradorModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_adm;

    @OneToOne
    @JoinColumn(name = "usuario_id_usuario")
    private UsuarioModelo usuarioAdministradorModelo;
    
}
