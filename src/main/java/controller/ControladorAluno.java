/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.AlunoDAO;
import model.Aluno;
import model.Produto;
import validator.ValidatorAluno;

/**
 *
 * @author Manoel
 */
@Controller

public class ControladorAluno {

	@Autowired
	private AlunoDAO alunoDAO;

	@Autowired
	private ValidatorAluno validatorAluno;

	@RequestMapping(value = "/cadastrarAluno", method = RequestMethod.GET)
	public String formularioAluno(ModelMap model) {
		model.addAttribute("aluno", new Aluno());
		return "aluno/cadastrarAluno";
	}

	@RequestMapping(value = "/alunoCadastrado", method = RequestMethod.POST)
	public String salvarAluno(ModelMap model, @ModelAttribute("aluno") Aluno aluno, BindingResult bResult) {
		validatorAluno.validate(aluno, bResult);
		if (bResult.hasErrors()) {
			return "aluno/cadastrarAluno";
		} else {
			alunoDAO.salvar(aluno);
			model.addAttribute("aluno", new Produto());
			return "redirect:/mostrarAlunos";
		}
	}

}
