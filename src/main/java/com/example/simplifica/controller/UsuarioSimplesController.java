package com.example.simplifica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.simplifica.model.UsuarioSimples;
import com.example.simplifica.repository.UsuarioSimplesRepository;

@Controller
public class UsuarioSimplesController {
	@Autowired
	UsuarioSimplesRepository repository;

	@GetMapping("/usuario")
	public String formCadastroUsuarioSimples(Model model) {
		model.addAttribute("usuariosimples", new UsuarioSimples());
		return "usuario";
	}

	@PostMapping("/usuario")
	public String gravaNovoUsuarioSimples(UsuarioSimples usuarioSimples){			
		repository.save(usuarioSimples);		
		return "redirect:quiz";		
	}	

}
