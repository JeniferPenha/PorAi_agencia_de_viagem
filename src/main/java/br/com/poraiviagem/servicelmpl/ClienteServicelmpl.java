package br.com.poraiviagem.servicelmpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.poraiviagem.model.ClienteModel;
import br.com.poraiviagem.repository.ClienteRepository;
import br.com.poraiviagem.service.ClienteService;

@Service
public class ClienteServicelmpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public ClienteModel salvarCliente(ClienteModel cliente) {
		return clienteRepository.save(cliente);	
	}

	@Override
	public List<ClienteModel> listarClientes() {
		 return clienteRepository.findAll();
	}

	@Override
	public ClienteModel obterClientePorID(long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteCliente(long id) {
		 clienteRepository.deleteById(id);
		
	}
	
	// Para usar na tabela reserva em listarReserva, mostrando apenas o nome do cliente.
	public List<String> listarNomesClientes() {
	    List<ClienteModel> clientes = clienteRepository.findAll();
	    return clientes.stream()
	            .map(ClienteModel::getNomeCliente)
	            .collect(Collectors.toList());
	}


}
