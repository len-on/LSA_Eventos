package br.com.api.back.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "evento")
@Getter
@Setter
@EqualsAndHashCode
public class EventoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_evento;
    private Date data_evento;
    private Date horario_evento;
    private String duracao_evento;
    private String nome_evento;
    
}
