package br.com.api.back.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="inscricao")
@Getter
@Setter
public class InscricaoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_inscricao;
    private Date horario_inscricao;
    private Date data_inscricao;
    private Long num_inscricao;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_inscricao == null) ? 0 : id_inscricao.hashCode());
        result = prime * result + ((horario_inscricao == null) ? 0 : horario_inscricao.hashCode());
        result = prime * result + ((data_inscricao == null) ? 0 : data_inscricao.hashCode());
        result = prime * result + ((num_inscricao == null) ? 0 : num_inscricao.hashCode());
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
        InscricaoModelo other = (InscricaoModelo) obj;
        if (id_inscricao == null) {
            if (other.id_inscricao != null)
                return false;
        } else if (!id_inscricao.equals(other.id_inscricao))
            return false;
        if (horario_inscricao == null) {
            if (other.horario_inscricao != null)
                return false;
        } else if (!horario_inscricao.equals(other.horario_inscricao))
            return false;
        if (data_inscricao == null) {
            if (other.data_inscricao != null)
                return false;
        } else if (!data_inscricao.equals(other.data_inscricao))
            return false;
        if (num_inscricao == null) {
            if (other.num_inscricao != null)
                return false;
        } else if (!num_inscricao.equals(other.num_inscricao))
            return false;
        return true;
    }

    
}
