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
@Table(name="tb_plat")
public class Plat {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_plat")
	private long idPlat;
	private String nomPlat;
	private String descripPlat;
	private double prixPlat;
	

	
	
	
	public Plat() {
		super();
	}

	
	public Plat(String nomPlat, String descripPlat, double prixPlat) {
		super();
		this.nomPlat = nomPlat;
		this.descripPlat = descripPlat;
		this.prixPlat = prixPlat;
	}


	public long getIdPlat() {
		return idPlat;
	}
	public void setIdPlat(long idPlat) {
		this.idPlat = idPlat;
	}
	public String getNomPlat() {
		return nomPlat;
	}
	public void setNomPlat(String nomPlat) {
		this.nomPlat = nomPlat;
	}
	public String getDescripPlat() {
		return descripPlat;
	}
	public void setDescripPlat(String descripPlat) {
		this.descripPlat = descripPlat;
	}


	public double getPrixPlat() {
		return prixPlat;
	}


	public void setPrixPlat(double prixPlat) {
		this.prixPlat = prixPlat;
	}


	@Override
	public String toString() {
		return "Plat [idPlat=" + idPlat + ", nomPlat=" + nomPlat + ", descripPlat=" + descripPlat + ", prixPlat="
				+ prixPlat + "]";
	}

	
	
	

}
