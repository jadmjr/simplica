package com.example.simplifica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.simplifica.QuizService;
import com.example.simplifica.model.Tesouro;
import com.example.simplifica.model.TesouroForm;
import com.example.simplifica.model.UsuarioSimples;
import com.example.simplifica.repository.RespostaTesouroRepository;
import com.example.simplifica.repository.TesouroRepository;

@Controller
public class TesouroController {
    @Autowired
    TesouroRepository repository;
    @Autowired
    TesouroForm tForm;
    @Autowired
    Tesouro q;
    @Autowired
    QuizService qService;
    @Autowired
    RespostaTesouroRepository rtp;

    @GetMapping("/quiz")
    public String formQuiz(Model model) {
        // model.addAttribute("tForm", repository.findAll());
        TesouroForm tForm = qService.getPerguntas();
        model.addAttribute("tForm", tForm);
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(tForm.getPerguntas());
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        return "quiz";
    }
    /*
     * 
     * @PostMapping("/submit")
     * public String submit(TesouroForm tForm) {
     * System.out.println(tForm.toString());
     * System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
     * System.out.println(tForm.getPerguntas());
     * System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
     * return "redirect:home";
     * }
     * 
     */

    /*
     * 
     * @PostMapping("/submit")
     * public String submit(TesouroForm tForm) {
     * rtp.save(tForm);
     * System.out.println(tForm.toString());
     * System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
     * System.out.println(tForm.getPerguntas());
     * System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
     * return "redirect:home";
     * }
     * 
     */

    @PostMapping("/submit")
    public String submit(TesouroForm tForm) {
        rtp.save(tForm);
        //rtp.save(us);
        System.out.println(tForm.toString());
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println(tForm.getPerguntas());
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        return "redirect:home";
    }
}
