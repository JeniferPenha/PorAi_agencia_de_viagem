package br.com.poraiviagem.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.poraiviagem.model.DestinoModel;
import br.com.poraiviagem.repository.DestinoRepository;
import br.com.poraiviagem.service.DestinoService;

@Service
public class DestinoServicelmpl implements DestinoService {
	

	    @Autowired
	    private DestinoRepository destinoRepository;

	    @Override
	    public List<DestinoModel> listarDestinos() {
	        return destinoRepository.findAll();
	    }

	    @Override
	    public DestinoModel obterDestinoPOrID(long id) {
	        return destinoRepository.findById(id).orElse(null);
	    }

	    @Override
	    public DestinoModel salvarDestino(DestinoModel destino) {
	        return destinoRepository.save(destino);
	    }

	    @Override
	    public void deleteDestino(long id) {
	        destinoRepository.deleteById(id);
	    }
	    
	 
	}

	

		
	
	
	
	   
	
	

