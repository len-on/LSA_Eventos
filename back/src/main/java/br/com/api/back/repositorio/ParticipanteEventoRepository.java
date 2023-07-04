package br.com.api.back.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.back.modelo.ParticipanteEventoModelo;

public interface ParticipanteEventoRepository extends JpaRepository<ParticipanteEventoModelo, Long>{
    
}
