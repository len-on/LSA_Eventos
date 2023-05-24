package br.com.api.back.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.back.modelo.EventoModelo;

@Repository
public interface EventoRepository extends JpaRepository<EventoModelo, Long> {
    
}
