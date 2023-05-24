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
@Table(name = "evento")
@Getter
@Setter
public class EventoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_evento;
    private Date data_evento;
    private Date horario_evento;
    private String duracao_evento;
    private String nome_evento;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_evento == null) ? 0 : id_evento.hashCode());
        result = prime * result + ((data_evento == null) ? 0 : data_evento.hashCode());
        result = prime * result + ((horario_evento == null) ? 0 : horario_evento.hashCode());
        result = prime * result + ((duracao_evento == null) ? 0 : duracao_evento.hashCode());
        result = prime * result + ((nome_evento == null) ? 0 : nome_evento.hashCode());
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
        EventoModelo other = (EventoModelo) obj;
        if (id_evento == null) {
            if (other.id_evento != null)
                return false;
        } else if (!id_evento.equals(other.id_evento))
            return false;
        if (data_evento == null) {
            if (other.data_evento != null)
                return false;
        } else if (!data_evento.equals(other.data_evento))
            return false;
        if (horario_evento == null) {
            if (other.horario_evento != null)
                return false;
        } else if (!horario_evento.equals(other.horario_evento))
            return false;
        if (duracao_evento == null) {
            if (other.duracao_evento != null)
                return false;
        } else if (!duracao_evento.equals(other.duracao_evento))
            return false;
        if (nome_evento == null) {
            if (other.nome_evento != null)
                return false;
        } else if (!nome_evento.equals(other.nome_evento))
            return false;
        return true;
    }

    
}
