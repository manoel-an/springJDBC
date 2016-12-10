/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import model.PesquisaAluno;

/**
 *
 * @author Manoel
 */
@Component
public class ValidatorPesquisaAluno implements Validator {

	public boolean supports(Class<?> type) {
		return PesquisaAluno.class.equals(type);
	}

	public void validate(Object o, Errors errors) {
		// ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cpf",
		// "cpf.obrigatorio");
		PesquisaAluno pesquisa = (PesquisaAluno) o;
		if (pesquisa.getCpf().length() > 1) {
			if (pesquisa.getCpf().length() < 14 || pesquisa.getCpf().length() > 14) {
				errors.rejectValue("cpf", "cpf.invalido");
			}
		}
	}

}
