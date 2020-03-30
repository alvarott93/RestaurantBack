package fr.adaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Login;
import fr.adaming.repository.ILoginRepository;
@Service
public class LoginService implements ILoginService{
	
	@Autowired
	ILoginRepository loginRepository;
	
	public Login createLogin(Login login) {
		loginRepository.save(login);
		return login;
	}

}
