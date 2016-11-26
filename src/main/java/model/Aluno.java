/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import org.springframework.stereotype.Component;

/**
 *
 * @author Manoel
 */
@Component
public class Aluno {

	private String nome;

	private int numeroMatricula;

	private int anoIngresso;

	private String cpf;

	public Aluno() {

	}

	public Aluno(String nome, int numeroMatricula, int anoIngresso, String cpf) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
		this.anoIngresso = anoIngresso;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.trim();
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf.trim();
	}

}
