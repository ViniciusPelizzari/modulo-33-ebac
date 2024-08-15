/**
 * 
 */
package br.com.vpelizzarisilva.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.vpelizzarisilva.domain.Aluno;

/**
 * @author Vinícius Pelizzari
 *
 */
public class AlunoDao implements IAlunoDao{

	@Override
	public Aluno cadastrar(Aluno aluno) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(aluno);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		
		return aluno;
	}

}
