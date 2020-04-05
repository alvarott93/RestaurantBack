package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_facture")
public class Facture {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_facture")
	private long idfacture;
	private double prixTotal;
	@JoinColumn(name="id_commande")
	@OneToOne
	private Commande commandeFacture;
	

	
	
	public Facture() {
		super();
	}


	public Facture(double prixTotal, Commande commandeFacture) {
		super();
		this.prixTotal = prixTotal;
		this.commandeFacture = commandeFacture;
	}
	
	


    


	public long getIdfacture() {
		return idfacture;
	}


	public void setIdfacture(long idfacture) {
		this.idfacture = idfacture;
	}


	public double getPrixTotal() {
		return prixTotal;
	}


	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}


	public Commande getCommandeFacture() {
		return commandeFacture;
	}


	public void setCommandeFacture(Commande commandeFacture) {
		this.commandeFacture = commandeFacture;
	}

	



	@Override
	public String toString() {
		return "Facture [idfacture=" + idfacture + ", prixTotal=" + prixTotal + ", commandeFacture=" + commandeFacture
				+ "]";
	}


	
	
	

}
