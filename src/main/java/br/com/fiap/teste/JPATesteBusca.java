package br.com.fiap.teste;



import javax.persistence.EntityManager;
import javax.persistence.Persistence;

//import br.com.fiap.entity.Disciplina;
import br.com.fiap.entity.Estabelecimento;

public class JPATesteBusca {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("smartcities")
				     				  .createEntityManager();
		
		Estabelecimento est = em.find(Estabelecimento.class, 1);
		/*
		 * Disciplina disc = em.find(Disciplina.class, 1); Disciplina discNova =
		 * em.find(Disciplina.class, 2);
		 */

		/*
		 * System.out.println(disc.getId() + " " + disc.getNomeDisciplina());
		 * System.out.println(discNova.getId() + " " + discNova.getNomeDisciplina());
		 */
		System.out.println(est.getId() + " " + est.getNomeEstabelecimento() + /* " " + est.getDataCriacao() + */ " " + est.getMediaAvaliacoes());

		/* disc.setNomeDisciplina("MFIN"); */
		
		try {
			/*
			 * em.merge(disc); 
			 * em.remove(discNova);
			 */

			em.getTransaction().begin();
			em.getTransaction().commit();
			
			System.out.println("\n----ATUALIZADO----\n");

			/*
			 * System.out.println(disc.getId() + " " + disc.getNomeDisciplina());
			 * System.out.println(discNova.getId() + " " + discNova.getNomeDisciplina());
			 */
			System.out.println(est.getId() + " " + est.getNomeEstabelecimento() + /* " " + est.getDataCriacao() + */ " " + est.getMediaAvaliacoes());
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null)
				em.close();
			
			System.exit(0);
		}
		
		

	}
}