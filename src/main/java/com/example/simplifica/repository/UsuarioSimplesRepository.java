package com.example.simplifica.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.simplifica.model.UsuarioSimples;

@Repository
public class UsuarioSimplesRepository {
	@Autowired
	JdbcTemplate jdbc;

	public void save(UsuarioSimples us) {
		String sql = "insert into usuario_simples(nome) values (?);";
		jdbc.update(sql, us.getNome());
	}

	public UsuarioSimples findById(Long id) {
		return jdbc.queryForObject("select * from usuario_simples where id_usuario_simples=?", this::mapper, id);
	}

	private UsuarioSimples mapper(ResultSet registro, int contador) throws SQLException {
		return new UsuarioSimples(registro.getLong("id_usuario_simples"), registro.getString("nome"));
	}

}
