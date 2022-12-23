package com.example.simplifica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.simplifica.repository.TipoQuestaoRepository;

@Controller
public class TipoQuestaoController {
    @Autowired
    TipoQuestaoRepository repository;

    @GetMapping("/menu-quiz")
    public String buscar(Model model) {
        model.addAttribute("tipo", repository.findAll());
        return "menu_quiz";
    }

    /*
     * @GetMapping("perfil")
     * public String relatorio(Model model) {
     * model.addAttribute("usuario", repository.findAll());
     * return "perfil";
     * }
     */

}
