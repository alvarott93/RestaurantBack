package fr.adaming.model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Login {
	
	@Id
	private String identifUser;
	private String passwordUser;
	
	
	
	public Login() {
		super();
	}
	public Login(String identifUser, String passwordUser) {
		super();
		this.identifUser = identifUser;
		this.passwordUser = passwordUser;
	}
	public String getIdentifUser() {
		return identifUser;
	}
	public void setIdentifUser(String identifUser) {
		this.identifUser = identifUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	
	

}
