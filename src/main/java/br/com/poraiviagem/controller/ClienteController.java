package br.com.poraiviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.poraiviagem.model.ClienteModel;
import br.com.poraiviagem.service.ClienteService;
  
@Controller
public class ClienteController {
	
		@Autowired
		private ClienteService clienteService;

	   @GetMapping("/cadastrarCliente")
	   public ModelAndView cadastrarCliente() {
	        ModelAndView modelAndView = new ModelAndView("cadastrarCliente");
	        modelAndView.addObject("cliente", new ClienteModel());
	        return modelAndView;
	    }

	    @PostMapping("/cadastrarCliente")
	    public ModelAndView cadastrarCliente(@ModelAttribute("cliente") ClienteModel cliente) {
	        ModelAndView modelAndView = new ModelAndView("redirect:/listarCliente");
	       clienteService.salvarCliente(cliente);
	       return modelAndView;
	    }

	    @GetMapping("/listarCliente")
	    public ModelAndView listarClientes() {
	        ModelAndView modelAndView = new ModelAndView("listarCliente");
	        modelAndView.addObject("clientes", clienteService.listarClientes());
	        return modelAndView;
	    }


	    @GetMapping("/editar/{id}")
	    public ModelAndView exibirFormularioEdicao(@PathVariable long id) {
	        ModelAndView modelAndView = new ModelAndView("editarCliente");
	        ClienteModel cliente = clienteService.obterClientePorID(id);
	        modelAndView.addObject("cliente", cliente);
	        return modelAndView;
	    }
	    

	    @PostMapping("/editar")
	    public ModelAndView editarCliente(@ModelAttribute("cliente") ClienteModel cliente) {
	        ModelAndView modelAndView = new ModelAndView("redirect:/listarCliente");

	        clienteService.salvarCliente(cliente);

	        return modelAndView;
	    }

	    @GetMapping("/excluir/{id}")
	    public String excluirCliente(@PathVariable long id, RedirectAttributes redirectAttributes) {
	          try {
	            clienteService.deleteCliente(id);

	            redirectAttributes.addFlashAttribute("successMessage", "Cliente excluído com sucesso!");
	        } catch (Exception e) {

	        	redirectAttributes.addFlashAttribute("errorMessage", "Erro ao excluir o cliente.");
	        }
	        return"redirect:/listarCliente";
	    }
	  
	}
	

