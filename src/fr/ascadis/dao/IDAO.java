package fr.ascadis.dao;

import java.util.List;

import fr.ascadis.model.Tetrimino;


public interface IDAO<T>
{
	public List<T> findAll();
	public T find(T id);
	public T save(T obj);
	public void delete(T obj);
}