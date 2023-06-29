package br.com.api.back.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "participante")
public class ParticipanteModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id_participante")
    private Long id_participante;

    @JsonProperty("turma_participante")
    private String turma_participante;

    @OneToOne
    @JoinColumn(name = "usuario_id_usuario")
    @JsonProperty("usuarioParticipanteModelo")
    private UsuarioModelo usuarioParticipanteModelo;

    public Long getId_participante() {
        return id_participante;
    }

    public void setId_participante(Long id_participante) {
        this.id_participante = id_participante;
    }

    public String getTurma_participante() {
        return turma_participante;
    }

    public void setTurma_participante(String turma_participante) {
        this.turma_participante = turma_participante;
    }

    public UsuarioModelo getUsuarioParticipanteModelo() {
        return usuarioParticipanteModelo;
    }

    public void setUsuarioParticipanteModelo(UsuarioModelo usuarioParticipanteModelo) {
        this.usuarioParticipanteModelo = usuarioParticipanteModelo;
    }

    
}
