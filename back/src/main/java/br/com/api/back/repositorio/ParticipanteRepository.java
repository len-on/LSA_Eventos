package br.com.api.back.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.back.modelo.ParticipanteModelo;

public interface ParticipanteRepository extends JpaRepository<ParticipanteModelo, Long>{
    
}
