package tn.esen.ecommerce.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
// pas @table car il n'exsite pas
@DiscriminatorValue("FACTORATION")
//dans la colonne type on va avoir : FACTORATION
public class AdresseFacturation extends Adresse {

	public AdresseFacturation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdresseFacturation(String rue, int codePostale, String ville) {
		super(rue, codePostale, ville);
		// TODO Auto-generated constructor stub
	}

	
}
