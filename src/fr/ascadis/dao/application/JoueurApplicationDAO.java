package fr.ascadis.dao.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.ascadis.dao.IDAO;
import fr.ascadis.model.Joueur;

public class JoueurApplicationDAO implements IDAO

{
	private Map<String, Joueur> joueurs = new HashMap<String, Joueur>();
	
	
	@Override
	public List<Joueur> findAll() {
		return new ArrayList<>(joueurs.values());
	}
	
	
	@Override
	public Joueur find(String id) {
		return joueurs.get(id);
	}
	
	
	@Override
	public Joueur save(Tetrimino tetrimino) {
		return joueurs.put(tetrimino.getId(), tetrimino);
	}
	
	
	@Override
	public void delete(Joueur joueur) {
		joueurs.remove(joueur.getId());
	}
}
