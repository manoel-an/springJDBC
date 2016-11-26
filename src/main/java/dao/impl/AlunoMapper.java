/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Aluno;

/**
 *
 * @author Manoel
 */
public class AlunoMapper implements RowMapper<Aluno> {

	public Aluno mapRow(ResultSet rs, int rowNum) throws SQLException {
		Aluno aluno = new Aluno();
		aluno.setNome(rs.getString("nome"));
		aluno.setNumeroMatricula(rs.getInt("numero_matricula"));
		aluno.setAnoIngresso(rs.getInt("ano_ingresso"));
		aluno.setCpf(rs.getString("cpf"));
		return aluno;
	}

}