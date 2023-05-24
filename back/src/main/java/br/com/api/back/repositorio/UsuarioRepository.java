package br.com.api.back.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.back.modelo.UsuarioModelo;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModelo, Long> {

    
}
