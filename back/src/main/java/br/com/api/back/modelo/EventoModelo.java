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
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "evento")
public class EventoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id_evento")
    private Long id_evento;

    @Column(name = "data_evento")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull
    @JsonProperty("data_evento")
    private LocalDate data_evento;

    @NotNull
    @JsonProperty("descricao_evento")
    private String descricao_evento;

    @NotNull
    @JsonProperty("duracao_evento")
    private String duracao_evento;

    @NotNull
    @JsonProperty("nome_evento")
    private String nome_evento;

    @ManyToOne
    @JoinColumn(name = "administrador_id_adm")
    @JsonProperty("administradorModelo")
    private AdministradorModelo administradorModelo;

    public Long getId_evento() {
        return id_evento;
    }

    public void setId_evento(Long id_evento) {
        this.id_evento = id_evento;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public String getDescricao_evento() {
        return descricao_evento;
    }

    public void setDescricao_evento(String descricao_evento) {
        this.descricao_evento = descricao_evento;
    }

    public String getDuracao_evento() {
        return duracao_evento;
    }

    public void setDuracao_evento(String duracao_evento) {
        this.duracao_evento = duracao_evento;
    }

    public String getNome_evento() {
        return nome_evento;
    }

    public void setNome_evento(String nome_evento) {
        this.nome_evento = nome_evento;
    }

    public AdministradorModelo getAdministradorModelo() {
        return administradorModelo;
    }

    public void setAdministradorModelo(AdministradorModelo administradorModelo) {
        this.administradorModelo = administradorModelo;
    }

    
    
}
