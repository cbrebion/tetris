package fr.ascadis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="tetrimino")
public class Tetrimino implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	@Column(name="tet_id")
	private String id;
	
	@Column(name="tet_nom")
	@NotNull
	@Size(max=30)
	private String nom;
	
	@Column(name="tet_couleur")
	@NotNull
	@Size(max=30)
	private String couleur;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
	public Tetrimino() {}
	
	public Tetrimino(String nom, String couleur) {
		this.nom = nom;
		this.couleur = couleur;
	}
}