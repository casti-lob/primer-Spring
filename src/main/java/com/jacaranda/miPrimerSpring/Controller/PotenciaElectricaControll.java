package com.jacaranda.miPrimerSpring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jacaranda.miPrimerSpring.model.PotenciaElectrica;

@Controller
public class PotenciaElectricaControll {
	@GetMapping("/miPotencia")
	public String potencia(Model model) {
		PotenciaElectrica myPotencia = new PotenciaElectrica();
		model.addAttribute("myPotencia", myPotencia);
		return "potenciaElectrica/calculoPotencia";
	}
	
	@PostMapping("/miPotencia/submit")
	public String potenciaSubmit(Model model,@Validated @ModelAttribute("myPotencia")
	PotenciaElectrica myPotencia, BindingResult bindingResult) {
		if(!bindingResult.hasErrors()) {
			model.addAttribute("resultado", myPotencia.result());

		}else {
			model.addAttribute("resultado", "Los valores no pueden ser negativos");

		}
		return "potenciaElectrica/calculoPotencia";
		
		
	}
	
}
