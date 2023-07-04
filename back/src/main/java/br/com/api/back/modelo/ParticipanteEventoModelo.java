package br.com.api.back.modelo;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "participante_evento")
public class ParticipanteEventoModelo {

    @ManyToOne
    @JsonProperty("participante_id_participante")
    @NotNull
    @JoinColumn(name = "participante_id_participante")
    private ParticipanteModelo participante_id_participante;

    @ManyToOne
    @JsonProperty("evento_id_evento")
    @NotNull
    @JoinColumn(name = "evento_id_evento")
    private EventoModelo evento_id_evento;

    public ParticipanteModelo getParticipante_id_participante() {
        return participante_id_participante;
    }

    public void setParticipante_id_participante(ParticipanteModelo participante_id_participante) {
        this.participante_id_participante = participante_id_participante;
    }

    public EventoModelo getEvento_id_evento() {
        return evento_id_evento;
    }

    public void setEvento_id_evento(EventoModelo evento_id_evento) {
        this.evento_id_evento = evento_id_evento;
    }
    
    
}
