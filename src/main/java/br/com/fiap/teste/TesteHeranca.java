package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.ClientePF;

public class TesteHeranca {
	public static void main(String args[]) {
		EntityManager em = Persistence.createEntityManagerFactory("smartcities").createEntityManager();

		ClientePF pf = new ClientePF();
				
		pf.setCpf("069.741.091-99");
		pf.setNomeCliente("Yago Silva");
		
		em.persist(pf);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
	}
}
