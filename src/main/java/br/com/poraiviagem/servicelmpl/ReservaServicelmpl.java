package br.com.poraiviagem.servicelmpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.poraiviagem.model.ReservaModel;
import br.com.poraiviagem.repository.ReservaRepository;
import br.com.poraiviagem.service.ReservaService;

@Service
public class ReservaServicelmpl implements ReservaService{
	
	@Autowired
	 private ReservaRepository reservaRepository;
	   
	    @Override
	    public List<ReservaModel> listarReservas() {
	        return reservaRepository.findAll();
	    }
	    @Override
	    public ReservaModel obterReservaPorId(long id) {
	        return reservaRepository.findById(id).orElse(null);
	    }
	    @Override
	    public ReservaModel salvarReserva(ReservaModel reserva) {
	        return reservaRepository.save(reserva);
	    }
	    @Override
	    public void excluirReserva(long idReserva) {
	        reservaRepository.deleteById(idReserva);
	    }
	    


}
