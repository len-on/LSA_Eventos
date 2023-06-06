package br.com.api.back.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@EqualsAndHashCode
public class UsuarioModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @NotNull
    private String nome_usuario;

    @NotNull
    private String senha_usuario;

    @NotNull
    private String CPF_usuario;

    @NotNull
    private String email_usuario;

    @NotNull
    @Column(name = "data_nascimento_usuario")
    private LocalDate data_nascimento_usuario;
    
}
