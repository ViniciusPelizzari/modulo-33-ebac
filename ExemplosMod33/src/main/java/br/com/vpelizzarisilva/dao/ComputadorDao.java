/**
 * 
 */
package br.com.vpelizzarisilva.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.vpelizzarisilva.domain.Computador;

/**
 * @author Vinícius Pelizzari
 *
 */
public class ComputadorDao implements IComputadorDao {

	@Override
	public Computador cadastrar(Computador computador) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(computador);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		
		return computador;
	}

}
