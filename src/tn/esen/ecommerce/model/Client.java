package tn.esen.ecommerce.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_client", nullable = false, length = 11)
	private int idClient;

	@Column(name = "nom_client", nullable = false, length = 50)
	private String nom;

	@Column(name = "prenom_client", nullable = false, length = 50)
	private String prenom;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "password", nullable = false, length = 50)
	private String password;

	// eager : charge moi automatiquement les aAdresse quand je fait un select
	// sur Client
	// cascade : quand je supprime un client suprime moi les adresses
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_adr_factoration")
	private AdresseFacturation adresseFacturation;

	// pas d'ajout de mappage dans les classes adresse
	@OneToOne
	@JoinColumn(name = "od_adr_livraison")
	private AdresseLivraison adresseLivraison;

	@OneToMany(mappedBy="client")
	private List<Commande> commandes;
	
	
	public AdresseFacturation getAdresseFacturation() {
		return adresseFacturation;
	}

	public void setAdresseFacturation(AdresseFacturation adresseFacturation) {
		this.adresseFacturation = adresseFacturation;
	}

	public AdresseLivraison getAdresseLivraison() {
		return adresseLivraison;
	}

	public void setAdresseLivraison(AdresseLivraison adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
