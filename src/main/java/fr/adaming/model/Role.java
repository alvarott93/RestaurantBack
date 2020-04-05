package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_role")
public class Role {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_role")
	private long idRole;
	private String nomRole;  //sera Client, Serveur o Manager
	
	
	
	public Role() {
		super();
	}



	public Role(String nomRole) {
		super();
		this.nomRole = nomRole;
	}



	public long getIdRole() {
		return idRole;
	}



	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}



	public String getNomRole() {
		return nomRole;
	}



	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}



	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nomRole=" + nomRole + "]";
	}
	
	
	
	
	

}
