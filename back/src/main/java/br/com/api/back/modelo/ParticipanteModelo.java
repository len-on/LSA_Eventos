package br.com.api.back.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "participante")
@Getter
@Setter
@EqualsAndHashCode
public class ParticipanteModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_participante;
    private String turma_participante;

    @OneToOne
    @JoinColumn(name = "usuario_id_usuario")
    private UsuarioModelo usuarioParticUsuarioModelo;
}
