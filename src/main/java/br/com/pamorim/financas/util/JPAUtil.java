package br.com.pamorim.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financasPostgreSQL");

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
