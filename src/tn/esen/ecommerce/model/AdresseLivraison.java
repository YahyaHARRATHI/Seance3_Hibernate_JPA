package tn.esen.ecommerce.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LIVRAISON")
public class AdresseLivraison extends Adresse {

	public AdresseLivraison() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdresseLivraison(String rue, int codePostale, String ville) {
		super(rue, codePostale, ville);
		// TODO Auto-generated constructor stub
	}

	
}
