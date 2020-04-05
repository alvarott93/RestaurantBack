package fr.adaming.model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Login {
	
	@Id
	private String identifUser;
	private String motDePass;
	
	
	
	public Login() {
		super();
	}

	
	public Login(String identifUser, String motDePass) {
		super();
		this.identifUser = identifUser;
		this.motDePass = motDePass;
	}

	

	public String getMotDePass() {
		return motDePass;
	}


	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}


	public String getIdentifUser() {
		return identifUser;
	}
	public void setIdentifUser(String identifUser) {
		this.identifUser = identifUser;
	}


	@Override
	public String toString() {
		return "Login [identifUser=" + identifUser + ", motDePass=" + motDePass + "]";
	}

	

}
