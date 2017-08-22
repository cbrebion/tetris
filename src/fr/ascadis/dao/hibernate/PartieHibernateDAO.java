package fr.ascadis.dao.hibernate;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.ascadis.dao.IPartieDAO;
import fr.ascadis.model.Partie;

@Stateless
public class PartieHibernateDAO implements IPartieDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Partie> findAll() {
	return (List<Partie>)em.createQuery("FROM Partie").getResultList();

	}

	@Override
	public Partie find(Partie id) {
	return em.find(Partie.class, id);
	}

	@Override
	public Partie save(Partie partie) {
	return em.merge(partie);
	}

	@Override
	public void delete(Partie partie) {
	em.remove(partie);

	}

}
