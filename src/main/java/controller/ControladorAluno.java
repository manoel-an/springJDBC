/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.AlunoDAO;
import model.Aluno;
import model.PesquisaAluno;
import model.Produto;
import validator.ValidatorAluno;
import validator.ValidatorPesquisaAluno;

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

	@Autowired
	private ValidatorPesquisaAluno validatorPesquisaAluno;

	@RequestMapping("/aluno")
	public ModelAndView controleAluno() {
		String message = "Bem-vindo ao sistema de cadastro de alunos!";
		return new ModelAndView("aluno/aluno", "message", message);
	}

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

	@RequestMapping(value = "/buscarAluno", method = RequestMethod.POST)
	public String pesquisarAluno(ModelMap model, @ModelAttribute("pesquisaAluno") PesquisaAluno pesquisa,
			BindingResult bResult) {
		validatorPesquisaAluno.validate(pesquisa, bResult);
		if (bResult.hasErrors()) {
			return "aluno/mostrarAlunos";
		} else {
			List<Aluno> pesqAluno = new ArrayList<Aluno>(0);
			Aluno aluno = alunoDAO.procurarAluno(pesquisa.getCpf());
			if (aluno != null) {
				pesqAluno.add(aluno);
			}
			model.addAttribute("listaAlunos", pesqAluno);
			return "aluno/mostrarAlunos";
		}
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/mostrarAlunos", method = RequestMethod.GET)
	public String mostraAlunos(ModelMap model) {
		List<Aluno> listaAlunos = alunoDAO.todosAlunos();
		model.addAttribute("listaAlunos", listaAlunos);
		model.addAttribute("pesquisaAluno", new PesquisaAluno());
		return "aluno/mostrarAlunos";
	}

	@RequestMapping(value = "/excluirAluno", method = RequestMethod.GET)
	public String excluirAluno(@RequestParam(required = true, value = "cpf") String cpf) {
		Aluno aluno = alunoDAO.procurarAluno(cpf);
		alunoDAO.excluir(aluno);
		return "redirect:/mostrarAlunos";
	}

	@RequestMapping(value = "/atualizarAluno")
	public String formularioAtualizarAluno(@RequestParam(required = true, value = "cpf") String cpf, ModelMap model) {
		Aluno aluno = alunoDAO.procurarAluno(cpf);
		if (aluno != null) {
			model.addAttribute("aluno", aluno);
			return "aluno/atualizarAluno";
		} else {
			model.addAttribute("message", "O Aluno de CPF \'" + cpf + "\' não foi encontrado.");
			String resultado = mostraAlunos(model);
			return resultado;
		}
	}

	@RequestMapping(value = "/alunoAtualizado", method = RequestMethod.POST)
	public String atualizarAluno(ModelMap model, @ModelAttribute("aluno") Aluno aluno, BindingResult bResult) {
		validatorAluno.validate(aluno, bResult);
		if (bResult.hasErrors()) {
			return "aluno/atualizarAluno";
		} else {
			alunoDAO.atualizar(aluno);
			model.addAttribute("aluno", new Aluno());
			return "redirect:/mostrarAlunos";
		}
	}

}
