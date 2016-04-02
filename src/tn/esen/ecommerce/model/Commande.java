package tn.esen.ecommerce.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="commande")
public class Commande implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_commande",nullable=false,length=11)
	private int idCommande;
	
	@Column(name="date_commande",nullable=false)
	//pour dire que date dans la base est de type DataTime
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@Column(name="monatnt_totale",nullable=false)
	private double montantTotal;
	
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;
	
	@OneToMany(mappedBy="commande")
	private List<LigneCommande> lignesCommande;
	
	public Commande(Date dateCommande, double montantTotal) {
		super();
		this.dateCommande = dateCommande;
		this.montantTotal = montantTotal;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getMontantTotal() {
		return montantTotal;
	}
	public void setMontantTotal(double montantTotal) {
		this.montantTotal = montantTotal;
	}
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	
	
	

}
