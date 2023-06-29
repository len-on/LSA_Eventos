package br.com.api.back.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "usuario")
public class UsuarioModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id_usuario")
    private Long id_usuario;

    @NotNull
    @JsonProperty("nome_usuario")
    private String nome_usuario;

    @NotNull
    @JsonProperty("senha_usuario")
    private String senha_usuario;

    @NotNull
    @JsonProperty("CPF_usuario")
    private String CPF_usuario;

    @Email
    @NotNull
    @JsonProperty("email_usuario")
    private String email_usuario;

    @NotNull
    @JsonProperty("data_nascimento_usuario")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_nascimento_usuario;

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getCPF_usuario() {
        return CPF_usuario;
    }

    public void setCPF_usuario(String cPF_usuario) {
        CPF_usuario = cPF_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public LocalDate getData_nascimento_usuario() {
        return data_nascimento_usuario;
    }

    public void setData_nascimento_usuario(LocalDate data_nascimento_usuario) {
        this.data_nascimento_usuario = data_nascimento_usuario;
    }

    
    
}
