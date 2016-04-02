package tn.esen.ecommerce.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande implements Serializable{

	// ce clé est un clé composite
	@EmbeddedId
	// on va  specifier chaque clé pour quelle table
	@AttributeOverrides({
		
		@AttributeOverride(name="idCommande",column=@Column(name="id_commande",nullable=false)),
		@AttributeOverride(name="idProduit",column=@Column(name="id_produit",nullable=false))
	})
	private LigneCommandeId id;
	
	
	private double prixTotal;
	
	@ManyToOne
	@JoinColumn(name="id_produit",nullable=false)
	private Produit produit;
	
	@ManyToOne
	@JoinColumn(name="id_commande",nullable=false)
	private Commande commande;

	public LigneCommandeId getId() {
		return id;
	}

	public void setId(LigneCommandeId id) {
		this.id = id;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
}
