package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_commande")
public class Commande {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_commande")
	private long idCommande;
	private String indications;
	@JoinColumn(name="id_reservation")
	@OneToOne
	private Reservation reservCommande;
	
	

//	

//	
//	
	
	public Commande() {
		super();
	}
	
	



	public Commande(String indications, Reservation reservCommande) {
	super();
	this.indications = indications;
	this.reservCommande = reservCommande;
}















	public String getIndications() {
		return indications;
	}



	public void setIndications(String indications) {
		this.indications = indications;
	}











    









	public long getIdCommande() {
		return idCommande;
	}





	public void setIdCommande(long idCommande) {
		this.idCommande = idCommande;
	}




	public Reservation getReservCommande() {
		return reservCommande;
	}
	public void setReservCommande(Reservation reservCommande) {
		this.reservCommande = reservCommande;
	}









	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", indications=" + indications + ", reservCommande="
				+ reservCommande + "]";
	}









	








   





    

    
	

}
