package br.com.poraiviagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.poraiviagem.model.ReservaModel;

public interface ReservaRepository extends JpaRepository<ReservaModel, Long> {

}
