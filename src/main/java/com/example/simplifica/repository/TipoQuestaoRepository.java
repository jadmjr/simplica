package com.example.simplifica.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.simplifica.model.TipoQuestao;

@Repository
public class TipoQuestaoRepository {
    @Autowired
    JdbcTemplate jdbc;

    public List<TipoQuestao> findAll() {
        return jdbc.query("select id_tipo_questoes, descricao from tipo_questoes;",
                (resultSet, rowNum) -> {
                    TipoQuestao tq = new TipoQuestao();
                    tq.setId(resultSet.getLong("id_tipo_questoes"));                   
                    tq.setDescricao(resultSet.getString("descricao"));                    
                    return tq;
                });

    }
    
    /*
     * 
     * 
     * public void save(Usuario usuario) {
     * String sql =
     * "insert into usuario(nome,usuario,email,senha,genero, aniversario) values (?,?,?,?,?,?);"
     * ;
     * jdbc.update(sql, usuario.getNome(), usuario.getUsuario(), usuario.getEmail(),
     * usuario.getSenha(),
     * usuario.getGenero(), usuario.getAniversario());
     * }
     * 
     * 
     * 
     * public List<Usuario> findAll() {
     * return jdbc.query("select * from usuario;", this::mapper);
     * }
     * 
     * 
     * 
     * public Usuario findById(Long id) {
     * return jdbc.queryForObject("select * from usuario where id_usuario=?",
     * this::mapper, id);
     * }
     * 
     * private Usuario mapper(ResultSet registro, int contador) throws SQLException
     * {
     * return new Usuario(registro.getLong("id_usuario"),
     * registro.getString("nome"), registro.getString("usuario"),
     * registro.getString("email"), registro.getString("senha"),
     * registro.getString("genero"),
     * registro.getDate("aniversario"));
     * }
     * 
     */

}
