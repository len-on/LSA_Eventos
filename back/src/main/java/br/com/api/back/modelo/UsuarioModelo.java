package br.com.api.back.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String nome_usuario;
    private String senha_usuario;
    private String CPF_usuario;
    private String email_usuario;
    private Date data_nascimento_usuario;


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
        result = prime * result + ((nome_usuario == null) ? 0 : nome_usuario.hashCode());
        result = prime * result + ((senha_usuario == null) ? 0 : senha_usuario.hashCode());
        result = prime * result + ((CPF_usuario == null) ? 0 : CPF_usuario.hashCode());
        result = prime * result + ((email_usuario == null) ? 0 : email_usuario.hashCode());
        result = prime * result + ((data_nascimento_usuario == null) ? 0 : data_nascimento_usuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UsuarioModelo other = (UsuarioModelo) obj;
        if (id_usuario == null) {
            if (other.id_usuario != null)
                return false;
        } else if (!id_usuario.equals(other.id_usuario))
            return false;
        if (nome_usuario == null) {
            if (other.nome_usuario != null)
                return false;
        } else if (!nome_usuario.equals(other.nome_usuario))
            return false;
        if (senha_usuario == null) {
            if (other.senha_usuario != null)
                return false;
        } else if (!senha_usuario.equals(other.senha_usuario))
            return false;
        if (CPF_usuario == null) {
            if (other.CPF_usuario != null)
                return false;
        } else if (!CPF_usuario.equals(other.CPF_usuario))
            return false;
        if (email_usuario == null) {
            if (other.email_usuario != null)
                return false;
        } else if (!email_usuario.equals(other.email_usuario))
            return false;
        if (data_nascimento_usuario == null) {
            if (other.data_nascimento_usuario != null)
                return false;
        } else if (!data_nascimento_usuario.equals(other.data_nascimento_usuario))
            return false;
        return true;
    }

    
}
