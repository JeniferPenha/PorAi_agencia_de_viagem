package br.com.poraiviagem.service;

import java.util.List;


import br.com.poraiviagem.model.ReservaModel;

public interface ReservaService {	
	 ReservaModel salvarReserva(ReservaModel reserva);	    
	 List<ReservaModel> listarReservas();	    
	ReservaModel obterReservaPorId(long id);	    
	 void excluirReserva(long id);
}
