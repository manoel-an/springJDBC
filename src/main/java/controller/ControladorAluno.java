/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.AlunoDAO;
import validator.ValidatorAluno;

/**
 *
 * @author vinicius
 */
@Controller

public class ControladorAluno {

	@Autowired
	private AlunoDAO alunoDAO;

	@Autowired
	private ValidatorAluno validatorAluno;

	@RequestMapping("/aluno")
	public ModelAndView controleProd() {
		String message = "Bem-vindo ao sistema de cadastro de Alunos!";
		return new ModelAndView("aluno/aluno", "message", message);
	}

}
