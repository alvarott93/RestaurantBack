package fr.adaming.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="tb_reservation")
public class Reservation {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_reservation")
	private long idReservation;
	//@Temporal(TemporalType.DATE)
	private Date horaire;
	private String horaire_String;
	private long numPersonnes;
	@JoinColumn(name="id_user_client")
	@ManyToOne
	private User userRes;
	@JoinColumn(name="id_user_serveur")
	@ManyToOne
	private User serveur;
	@JoinColumn(name="id_tables")
	@ManyToOne
	public Tables tableReserv;
	
	
	public Reservation() {
		super();
	}


	public Reservation(Date horaire, long numPersonnes, User userRes) {
		super();
		this.horaire = horaire;
		this.numPersonnes = numPersonnes;
		this.userRes = userRes;
	}
	
	


	public Reservation(Date horaire, long numPersonnes, User userRes, Tables tableReserv) {
		super();
		this.horaire = horaire;
		this.numPersonnes = numPersonnes;
		this.userRes = userRes;
		this.tableReserv = tableReserv;
	}


	public long getIdReservation() {
		return idReservation;
	}


	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}


	public Date getHoraire() {
		return horaire;
	}


	public void setHoraire(Date horaire) {
		this.horaire = horaire;
	}


	public long getNumPersonnes() {
		return numPersonnes;
	}


	public void setNumPersonnes(long numPersonnes) {
		this.numPersonnes = numPersonnes;
	}


	public User getUserRes() {
		return userRes;
	}


	public void setUserRes(User userRes) {
		this.userRes = userRes;
	}
	
	


	public User getServeur() {
		return serveur;
	}


	public void setServeur(User serveur) {
		this.serveur = serveur;
	}
	
	


	public Tables getTableReserv() {
		return tableReserv;
	}


	public void setTableReserv(Tables tableReserv) {
		this.tableReserv = tableReserv;
	}
	
	


	public String getHoraire_String() {
		return horaire_String;
	}


	public void setHoraire_String(String horaire_String) {
		this.horaire_String = horaire_String;
	}


	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", horaire=" + horaire + ", horaire_String="
				+ horaire_String + ", numPersonnes=" + numPersonnes + ", userRes=" + userRes + ", serveur=" + serveur
				+ ", tableReserv=" + tableReserv + "]";
	}



     


    
	
	

}
