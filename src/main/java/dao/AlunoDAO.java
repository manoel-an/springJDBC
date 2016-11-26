/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.List;

import model.Aluno;

/**
 *
 * @author Manoel
 */
public interface AlunoDAO {

	/**
	 * Metodo usado para atualizar aluno na tabela Aluno
	 * 
	 * @param aluno
	 */
	void atualizar(Aluno aluno);

	/**
	 * Metodo chamado para excluir aluno da tabela Aluno
	 * 
	 * @param alumo
	 */
	void excluir(Aluno aluno);

	/**
	 * Metodo chamado para adicionar aluno na tabela Aluno
	 * 
	 * @param aluno
	 */
	void salvar(Aluno aluno);

	/**
	 * Metodo chamado para listar todos os alunos da tabela Aluno
	 * 
	 * @return List<Aluno>
	 */
	List todosAlunos();

	/**
	 * Metodo chamado para retornar um especifico aluno, consultado pelo codigo
	 * 
	 * @param codigo
	 * @return aluno
	 */
	Aluno procurarAluno(String cpf);

}
