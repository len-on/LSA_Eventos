package br.com.api.back.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "participante_realiza_inscricao")
@Getter
@Setter
@EqualsAndHashCode
public class ParticipanteInscricaoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_participante_inscricao;

    @ManyToOne
    @JoinColumn(name = "participante_id_participante")
    private ParticipanteModelo participanteInscricaoModelo;

    @ManyToOne
    @JoinColumn(name = "inscricao_id_inscricao")
    private InscricaoModelo inscricaoParticipanteModelo;

}
