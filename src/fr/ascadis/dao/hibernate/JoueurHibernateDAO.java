package fr.ascadis.dao.hibernate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.ascadis.dao.IJoueurDAO;
import fr.ascadis.model.Joueur;

public class JoueurHibernateDAO implements IJoueurDAO {

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Joueur> findAll() {
		return (List<Joueur>) em.createQuery("FROM Joueur").getResultList();
	}

	@Override
	public Joueur find(Joueur id) {
		return em.find(Joueur.class, id);
	}

	@Override
	public Joueur save(Joueur joueur) {
		return em.merge(joueur);
	}

	@Override
	public void delete(Joueur joueur) {
		em.remove(joueur);

	}

}
