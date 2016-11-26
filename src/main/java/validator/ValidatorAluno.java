/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import model.Aluno;
import model.Produto;

/**
 *
 * @author Manoel
 */
@Component
public class ValidatorAluno implements Validator {

	public boolean supports(Class<?> type) {
		return Produto.class.equals(type);
	}

	public void validate(Object o, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome", "nome.obrigatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "numeroMatricula", "matricula.obrigatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "anoIngresso", "ano.obrigatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cpf", "cpf.obrigatorio");
		Aluno aluno = (Aluno) o;
		if (aluno.getCpf().length() < 14 || aluno.getCpf().length() > 14) {
			errors.rejectValue("cpf", "cpf.invalido");
		}
	}

}
