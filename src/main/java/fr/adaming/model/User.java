package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_user")
	private long idUser;
	@Column(unique=true)
	private String identifUser;
	private String nomUser;
	private String prenomUser;
	private String mailUser;
	private String motDePass;
	@JoinColumn(name="id_role")
	@ManyToOne
	private Role roleUser;
	
	
	
	public User() {
		super();
	}



   



	public User(String identifUser, String nomUser, String prenomUser, String mailUser, String motDePass,
			Role roleUser) {
		super();
		this.identifUser = identifUser;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.mailUser = mailUser;
		this.motDePass = motDePass;
		this.roleUser = roleUser;
	}







	public long getIdUser() {
		return idUser;
	}



	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}



	public String getNomUser() {
		return nomUser;
	}



	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}



	public String getPrenomUser() {
		return prenomUser;
	}



	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}



	public String getMailUser() {
		return mailUser;
	}



	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}



	public String getMotDePass() {
		return motDePass;
	}



	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}



	public Role getRoleUser() {
		return roleUser;
	}


    



	public String getIdentifUser() {
		return identifUser;
	}







	public void setIdentifUser(String identifUser) {
		this.identifUser = identifUser;
	}







	public void setRoleUser(Role roleUser) {
		this.roleUser = roleUser;
	}







	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", identifUser=" + identifUser + ", nomUser=" + nomUser + ", prenomUser="
				+ prenomUser + ", mailUser=" + mailUser + ", motDePass=" + motDePass + ", roleUser=" + roleUser + "]";
	}







	
	
	
	
	
	

}
