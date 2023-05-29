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
@Table(name = "adm_gerencia_evento")
@Getter
@Setter
@EqualsAndHashCode
public class AdmEventoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_adm_evento;
    
    @ManyToOne
    @JoinColumn(name = "administrador_id_adm")
    private AdministradorModelo admEventModelo;

    @ManyToOne
    @JoinColumn(name = "evento_id_evento")
    private EventoModelo eventoAdmModelo;
}
