package tn.esen.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_adresse" , discriminatorType=DiscriminatorType.STRING)
public class Adresse {
@Id@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="ip_adresses",nullable=true,length=11)
	private int idAdresse;
	private String rue;
	private int codePostale;
	private String ville;
	
	

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Adresse(String rue, int codePostale, String ville) {
		super();
		this.rue = rue;
		this.codePostale = codePostale;
		this.ville = ville;
	}



	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
