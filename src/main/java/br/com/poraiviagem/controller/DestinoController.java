package br.com.poraiviagem.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import br.com.poraiviagem.model.DestinoModel;
import br.com.poraiviagem.service.DestinoService;


@Controller
public class DestinoController {

	    @Autowired
	    private DestinoService destinoService;

	    @GetMapping("/cadastrarDestino")
	    public ModelAndView cadastrarDestino() {
	        ModelAndView modelAndView = new ModelAndView("cadastrarDestino");

	        modelAndView.addObject("destino", new DestinoModel());

	       List<String> estados = Arrays.asList("Acre", "Alagoas", "Amapá", "Amazonas", 
	                "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás",
	                "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", 
	                "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", 
	                "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", 
	                "Santa Catarina", "São Paulo", "Sergipe", "Tocantins");

	        modelAndView.addObject("estados", estados);

	        return modelAndView;
	    }
	    
	    @PostMapping("/cadastrarDestino")
	    public ModelAndView cadastrarDestino(DestinoModel destino) {
	        ModelAndView modelAndView = new ModelAndView("redirect:/listarDestinos");

	        destinoService.salvarDestino(destino);

	        return modelAndView;
	    }

	
	    @GetMapping("/{id}/editarDestino")
	    public ModelAndView editarDestinoForm(@PathVariable Long id) {
	        ModelAndView modelAndView = new ModelAndView("editarDestino");

	        DestinoModel destino = destinoService.obterDestinoPOrID(id);
	        modelAndView.addObject("destino", destino);

	        List<String> estados = Arrays.asList("Acre", "Alagoas", "Amapá", "Amazonas",
	                "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás",
	                "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais",
	                "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro",
	                "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima",
	                "Santa Catarina", "São Paulo", "Sergipe", "Tocantins");

	        modelAndView.addObject("estados", estados);

	        return modelAndView;
	    }
	    @PostMapping("/{id}/editarDestino")
	    public ModelAndView editarDestino(DestinoModel destino) {
	    
	        ModelAndView modelAndView = new ModelAndView("redirect:/listarDestinos");
	        destinoService.salvarDestino(destino);
	        return modelAndView;
	    }


	    
	    @GetMapping("/delete/{id}")
	    public String deleteDestino(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
	        try {
	            destinoService.deleteDestino(id);

	            redirectAttributes.addFlashAttribute("successMessage", "Destino excluído com sucesso!");
	        } catch (Exception e) {

	        	redirectAttributes.addFlashAttribute("errorMessage", "Erro ao excluir o destino.");
	        }
	        return "redirect:/listarDestinos";
	    }

	  
	    @RequestMapping("/listarDestinos")
	    @GetMapping
	    public ModelAndView listarDestinos() {
	        ModelAndView modelAndView = new ModelAndView("listarDestinos");

	        List<DestinoModel> destinos = destinoService.listarDestinos();
	        modelAndView.addObject("destinos", destinos);

	        return modelAndView;
	    }
	    
	  

	}

	
	
    
   
