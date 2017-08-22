package fr.ascadis.dao.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.ascadis.dao.IDAO;
import fr.ascadis.dao.ITetriminoDAO;
import fr.ascadis.model.Tetrimino;

public class TetriminoApplicationDAO implements ITetriminoDAO
{
	private Map<String, Tetrimino> tetriminos = new HashMap<String, Tetrimino>();

	@Override
	public List findAll() {
		return new ArrayList<>(tetriminos.values());
	}

	@Override
	public Tetrimino find(Tetrimino id) {
		return tetriminos.get(id);
	}

	@Override
	public Tetrimino save(Tetrimino tetrimino) {
		return tetriminos.put(tetrimino.getId(), tetrimino);
	}

	@Override
	public void delete(Tetrimino tetrimino) {
		tetriminos.remove(tetrimino).getId();
	}
}