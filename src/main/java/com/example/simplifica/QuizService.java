package com.example.simplifica;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.simplifica.model.Tesouro;
import com.example.simplifica.model.TesouroForm;
import com.example.simplifica.repository.TesouroRepository;


@Service
public class QuizService {	
	
	@Autowired
	Tesouro tesouro;
	@Autowired
    TesouroForm tForm;
	@Autowired
    TesouroRepository tr;
	
	public TesouroForm getPerguntas() {
		List<Tesouro> aux = tr.findAll();		
		
		tForm.setPerguntas(aux);
		
		return tForm;
	}
	

	
	
}
