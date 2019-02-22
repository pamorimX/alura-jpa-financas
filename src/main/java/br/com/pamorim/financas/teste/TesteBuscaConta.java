package br.com.pamorim.financas.teste;

import javax.persistence.EntityManager;

import br.com.pamorim.financas.modelo.Conta;
import br.com.pamorim.financas.util.JPAUtil;

public class TesteBuscaConta {

	public static void main(String args[]) {

		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		Conta conta = em.find(Conta.class, 1);
		em.getTransaction().commit();

		em.close();

		System.out.println(conta.getTitular());
	}

}
