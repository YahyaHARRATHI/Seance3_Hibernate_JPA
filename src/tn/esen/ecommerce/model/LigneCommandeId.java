package tn.esen.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


// clé composée
@Embeddable
public class LigneCommandeId implements Serializable {
	
	@Column(name="id_cammande",nullable=false)
	private int idCommande ;
	
	@Column(name="id_produit",nullable=false)
	private int idProduit;

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	
	

}
