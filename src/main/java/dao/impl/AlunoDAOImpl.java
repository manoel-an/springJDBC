/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import dao.AlunoDAO;
import model.Aluno;

/**
 *
 * @author Manoel
 */
@Repository
public class AlunoDAOImpl implements AlunoDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DriverManagerDataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * Metodo chamado para atualizar aluno na tabela Aluno do banco de dados.
	 * 
	 * @param aluno
	 */
	public void atualizar(Aluno aluno) {
		String sql = "UPDATE aluno SET nome=?, numero_matricula=?, ano_ingresso=?" + "WHERE cpf=?";
		jdbcTemplate.update(sql,
				new Object[] { aluno.getNome(), aluno.getNumeroMatricula(), aluno.getAnoIngresso(), aluno.getCpf() });
	}

	/**
	 * Metodo chamado para excluir produto na tabela Produto do banco de dados.
	 * 
	 * @param produto
	 */
	public void excluir(Aluno aluno) {
		String sql = "DELETE FROM aluno WHERE cpf = ?";
		jdbcTemplate.update(sql, aluno.getCpf());
	}

	/**
	 * Metodo chamado para adicionar aluno na tabela Aluno do banco de dados.
	 * 
	 * @param aluno
	 */
	public void salvar(Aluno aluno) {
		String sql = "INSERT INTO aluno (nome, numero_matricula, ano_ingresso, cpf) " + "values (?, ?, ?, ?)";
		jdbcTemplate.update(sql,
				new Object[] { aluno.getNome(), aluno.getNumeroMatricula(), aluno.getAnoIngresso(), aluno.getCpf() });
	}

	/**
	 * Metodo chamado para listar todos os alunos na tabela Aluno do banco de
	 * dados.
	 * 
	 * @return
	 */
	public List todosAlunos() {
		String sql = "SELECT * FROM aluno";
		List<Aluno> listaAlunos = jdbcTemplate.query(sql, new AlunoMapper());
		return listaAlunos;
	}

	/**
	 * Metodo chamado para executar query para procurar aluno na tabela Aluno do
	 * banco de dados. Parametro da consulta: codigo.
	 * 
	 * @param codigo
	 * @return
	 */
	public Aluno procurarAluno(String cpf) {
		String sql = "SELECT * FROM aluno WHERE cpf=?";
		try {
			Aluno aluno = jdbcTemplate.queryForObject(sql, new Object[] { cpf }, new AlunoMapper());
			return aluno;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

}
