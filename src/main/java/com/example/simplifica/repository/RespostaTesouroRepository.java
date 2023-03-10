package com.example.simplifica.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.simplifica.model.RespostaTesouro;
import com.example.simplifica.model.Tesouro;
import com.example.simplifica.model.TesouroForm;


@Repository
public class RespostaTesouroRepository {
    @Autowired
    JdbcTemplate jdbc;

    @Autowired
    TesouroForm tForm;

    @Autowired
    Tesouro tesouro;


    public void save(TesouroForm tForm) {
        String sql = "insert into resposta_tesouro(id_pergunta, id_resposta) values (?,?);";       
        for (Tesouro t : tForm.getPerguntas()) {
            jdbc.update(sql, t.getId(), t.getEscolha());
        }      
    }

   

    /* 

    public void save(TesouroForm tForm) {
        String sql = "insert into resposta_tesouro(id_pergunta, id_resposta) values (?,?);";
        for (Tesouro t : tForm.getPerguntas()) {
            jdbc.update(sql, t.getId(), t.getEscolha());
        }

    }

    */
}

// apartamento.getProprietario().getId()