package br.com.poraiviagem.service;

import java.util.List;

import br.com.poraiviagem.model.DestinoModel;

public interface DestinoService {
		DestinoModel salvarDestino(DestinoModel destino);
	    List<DestinoModel> listarDestinos();
	    DestinoModel obterDestinoPOrID(long id);
	    void deleteDestino(long id);
	    List<String> listarNomesDestinos();
	    
	}


