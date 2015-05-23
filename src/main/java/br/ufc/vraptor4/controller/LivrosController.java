package br.ufc.vraptor4.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.ufc.vraptor4.dao.LivroDAO;
import br.ufc.vraptor4.model.Livro;

@Controller
public class LivrosController {

	private final LivroDAO dao;
	private final Result result;
	
	@Inject
	public LivrosController(LivroDAO dao, Result result){
		this.dao = dao;
		this.result = result;
	}
	
	protected LivrosController(){
		this(null, null);
	}
	
	public void formulario(){}
	
	public void salva(Livro livro){
		dao.adiciona(livro);
		result.redirectTo(this).formulario();
	}
	
}
