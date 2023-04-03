package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

//import br.com.fiap.entity.Disciplina;
import br.com.fiap.entity.Estabelecimento;

public class JPATeste {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("smartcities").createEntityManager();
		// CRIA UM INSERT NA BASE

		try {
			Calendar data = new GregorianCalendar(2023, Calendar.MARCH, 02);
			Estabelecimento est = new Estabelecimento(0, "Mercado Central", data, 1.3);
			/*
			 * Disciplina disc = new Disciplina(0, "MFIN"); Disciplina discNova = new
			 * Disciplina(0, "CBANK");
			 */

			em.persist(est);
			/*
			 * em.persist(disc); em.persist(discNova);
			 */
			
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
			System.exit(0);
		}

	}
}