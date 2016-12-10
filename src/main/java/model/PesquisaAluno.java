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
public class PesquisaAluno {

	private String cpf;

	public PesquisaAluno() {

	}

	public PesquisaAluno(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
