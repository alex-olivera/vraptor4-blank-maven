package br.ufc.vraptor4.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.ufc.vraptor4.dao.LivroDAO;
import br.ufc.vraptor4.model.Livro;

public class LivroDAOImpl implements LivroDAO{

	private final EntityManager entityManager;
	
	protected LivroDAOImpl() {
		this(null);
	}
	
	@Inject
	public LivroDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void adiciona(Livro livro) {
		if(livro.getId() == null){
			this.entityManager.persist(livro);
		}else{
			this.entityManager.merge(livro);
		}
	}

	@Override
	public List<Livro> lista() {
		return this.entityManager.createQuery("select l from Livro l", Livro.class).getResultList();
	}

	@Override
	public Livro getLivroByIsbn(String isbn) {
		return null;
	}

	
	
}
