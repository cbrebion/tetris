package fr.ascadis.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.ascadis.dao.ITetriminoDAO;
import fr.ascadis.model.Tetrimino;

public class TetriminoHibernateDAO implements ITetriminoDAO {

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Tetrimino> findAll() {
		return (List<Tetrimino>)em.createQuery("FROM Tetrimino").getResultList();
	}

	@Override
	public Tetrimino find(Tetrimino id) {
		return em.find(Tetrimino.class, id);
	}

	@Override
	public Tetrimino save(Tetrimino tetrimino) {
		return em.merge(tetrimino);
	}

	@Override
	public void delete(Tetrimino tetrimino) {
		em.remove(tetrimino);

	}

}
