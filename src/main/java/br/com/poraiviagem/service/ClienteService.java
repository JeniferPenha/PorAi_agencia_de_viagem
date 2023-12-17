package br.com.poraiviagem.service;

import java.util.List;

import br.com.poraiviagem.model.ClienteModel;

public interface ClienteService {
    ClienteModel salvarCliente(ClienteModel cliente);
    List<ClienteModel> listarClientes();
    ClienteModel obterClientePorID(long id);
    void deleteCliente(long id);
    List<String> listarNomesClientes(); 
	
}
