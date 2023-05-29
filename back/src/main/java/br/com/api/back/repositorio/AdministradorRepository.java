package br.com.api.back.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.back.modelo.AdministradorModelo;

public interface AdministradorRepository extends JpaRepository<AdministradorModelo, Long> {
    
}
