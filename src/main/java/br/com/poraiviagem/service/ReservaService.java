package br.com.poraiviagem.service;

import java.util.List;
import java.util.Optional;

import br.com.poraiviagem.model.ReservaModel;

public interface ReservaService {	
	 ReservaModel salvarReserva(ReservaModel reserva);	    
	 List<ReservaModel> listarReservas();	    
	 Optional<ReservaModel> obterReservaPorId(long id);	    
	 void excluirReserva(long id);
}
