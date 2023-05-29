package br.com.api.back.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.back.modelo.InscricaoModelo;

public interface InscricaoRepository extends JpaRepository<InscricaoModelo, Long> {
    
}
