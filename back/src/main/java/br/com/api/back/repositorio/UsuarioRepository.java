package br.com.api.back.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.back.modelo.UsuarioModelo;

public interface UsuarioRepository extends JpaRepository<UsuarioModelo, Long> {

    
}
