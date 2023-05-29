package br.com.api.back.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.back.modelo.AdmEventoModelo;

public interface AdmEventoRepository extends JpaRepository<AdmEventoModelo, Long> {
    
}
