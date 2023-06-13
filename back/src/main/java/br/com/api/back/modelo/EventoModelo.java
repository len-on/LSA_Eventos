package br.com.api.back.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

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

    @Column(name = "data_evento")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate data_evento;

    @NotNull
    private String descricao_evento;

    @NotNull
    private String duracao_evento;

    @NotNull
    private String nome_evento;

    @ManyToOne
    @JoinColumn(name = "administrador_id_adm")
    private AdministradorModelo administradorModelo;
    
}
