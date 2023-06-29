package br.com.api.back.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.back.modelo.EventoModelo;


public interface EventoRepository extends JpaRepository<EventoModelo, Long> {


    List<EventoModelo> save(List<EventoModelo> eventoModelo);
    
}
