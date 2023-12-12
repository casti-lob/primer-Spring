package com.jacaranda.miPrimerSpring.Controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jacaranda.miPrimerSpring.model.Calculadora;

@Controller
public class MiPrimerControlador {

	@GetMapping({"/","/index"})
	public String holaMundo(Model model, @RequestParam("name") Optional<String> nameFromClient) {
		model.addAttribute("name", nameFromClient.orElse("anonimo"));
		return "index";
	}
	//Para url tipo /saluda/Jose
	@GetMapping("/saluda/{name}")
	public String saludaMundo(Model model, @PathVariable String name) {
		model.addAttribute(name, name);
		return "index";
	}
	
	@GetMapping("/addUser")
	public String addUser() {
		return "user/addUser";
	}
	
	@GetMapping("/calculadora")
	public String calculadora(Model model) {
		Calculadora calc = new Calculadora();
		model.addAttribute("calc", calc);
		return"calculadora/calculadora";
	}
	
	@PostMapping("/calculadora/submit")
	public String result(Model model, @ModelAttribute("calc") Calculadora calculadora) {
		model.addAttribute("resultado", calculadora.result());
		return"calculadora/calculadora";
	}
}
