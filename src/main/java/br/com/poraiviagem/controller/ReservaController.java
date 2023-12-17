package br.com.poraiviagem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.poraiviagem.model.ReservaModel;
import br.com.poraiviagem.service.ClienteService;
import br.com.poraiviagem.service.DestinoService;
import br.com.poraiviagem.service.ReservaService;

@Controller
public class ReservaController {
	
	 @Autowired
	    private ReservaService reservaService;
	 
	 @Autowired
	 	private ClienteService clienteService;
	 
	 @Autowired
	 	private DestinoService destinoService;
	 
	 	//para acessar "http://localhost:8080/reservas/reserva/cadastrarReserva"
	    @GetMapping("/cadastrarReservas")
	    public ModelAndView cadastrarReserva(Model model) {
	        ModelAndView modelAndView = new ModelAndView("cadastrarReserva");

	        model.addAttribute("reserva", new ReservaModel());
	        model.addAttribute("listaDeClientes", clienteService.listarNomesClientes());
	        model.addAttribute("listaDeDestinos", destinoService.listarDestinos());       
	        

	        return modelAndView;
	    }

	    @PostMapping("/cadastrarReservas")
	    public ModelAndView cadastrarReserva(@ModelAttribute("reserva") ReservaModel reserva, RedirectAttributes redirectAttributes) {
	        ModelAndView modelAndView = new ModelAndView("redirect:listarReservas");

	        try {
	            reservaService.salvarReserva(reserva);
	            redirectAttributes.addFlashAttribute("successMessage", "Reserva cadastrada com sucesso!");
	        } catch (Exception e) {
	            redirectAttributes.addFlashAttribute("errorMessage", "Erro ao cadastrar a reserva.");
	        }

	        return modelAndView;
	    }
	        @GetMapping("/listarReservas")
		    public ModelAndView listarReservas(Model model) {
		        ModelAndView modelAndView = new ModelAndView("listarReservas");

		        List<ReservaModel> reservas = reservaService.listarReservas();
		        modelAndView.addObject("reservas", reservas);

		        return modelAndView;
		    }
		

	
	
	

}
