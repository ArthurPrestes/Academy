package br.com.academy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.academy.model.Aluno;

@Controller
public class AlunoController {

	@GetMapping("/InserirAlunos")
	public ModelAndView insertAlunos(Aluno aluno) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FormAluno");
		mv.addObject(aluno = new Aluno());
		return mv;
	}
}
