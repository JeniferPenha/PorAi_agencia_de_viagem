package br.com.poraiviagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.poraiviagem.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

}
