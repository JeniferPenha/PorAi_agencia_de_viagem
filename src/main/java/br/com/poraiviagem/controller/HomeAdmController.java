package br.com.poraiviagem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeAdmController {
	
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/index")
    public String home() {
    	return "index";
    }
	

}
