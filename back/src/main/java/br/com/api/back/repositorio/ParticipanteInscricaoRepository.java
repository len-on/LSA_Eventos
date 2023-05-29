package br.com.api.back.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.back.modelo.ParticipanteInscricaoModelo;

public interface ParticipanteInscricaoRepository extends JpaRepository<ParticipanteInscricaoModelo, Long> {
    
}
