package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_tables")
public class Tables {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_tables")
	private long idTables;
	public long capTables;   //asi con cada mesa tenemos capacidad y num de mesas de ese tipo, para hacer el loop.
	public long numTables;    //el max va a ser +2.
//	@JoinColumn(name="id_reserv")
//	@OneToMany
//	public Reservation reservTables;
	
	
	public Tables() {
		super();
	}



    


	public Tables(long capTables, long numTables) {
		super();
		this.capTables = capTables;
		this.numTables = numTables;
		//this.reservTables = reservTables;
	}






	public long getIdTables() {
		return idTables;
	}



	public void setIdTables(long idTables) {
		this.idTables = idTables;
	}



	public long getCapTables() {
		return capTables;
	}



	public void setCapTables(long capTables) {
		this.capTables = capTables;
	}



	public long getNumTables() {
		return numTables;
	}



	public void setNumTables(long numTables) {
		this.numTables = numTables;
	}



//
//
//
//	public Reservation getReservTables() {
//		return reservTables;
//	}
//
//
//
//
//
//
//	public void setReservTables(Reservation reservTables) {
//		this.reservTables = reservTables;
//	}
//
//
//
//
//
//
//	@Override
//	public String toString() {
//		return "Tables [idTables=" + idTables + ", capTables=" + capTables + ", numTables=" + numTables
//				+ ", reservTables=" + reservTables + "]";
//	}
//	
//	
//     






}
