package br.ufc.vraptor4.dao;

import java.util.List;

import br.ufc.vraptor4.model.Livro;

public interface LivroDAO {

	public void adiciona(Livro livro);
	public List<Livro> lista();
	public Livro getLivroByIsbn(String isbn);
	
}
