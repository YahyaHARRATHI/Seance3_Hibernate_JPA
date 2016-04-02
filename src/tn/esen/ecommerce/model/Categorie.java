package tn.esen.ecommerce.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_categorie",nullable=false,length=11)
	private int idCategorie;
	private String libelle;
	@OneToMany(mappedBy="categorie")
	private List<Produit> produits;
	//list : ordonnée accepte la duplication
	// Set : pas de duplication , non ordonée
	
	
	
	public Categorie() {
		super();  // si vous le mettez pas , c'est par defaut appelé car tous herite de Objet
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	// un constructeur sans param existe par defaut si vous avez pas creer un const avec param
	
	//mais si vous avez ajoutez un cons avec param ,il faut ajouter un const sans param

	
}
