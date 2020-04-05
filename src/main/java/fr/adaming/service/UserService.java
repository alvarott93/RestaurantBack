package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import fr.adaming.model.Role;
import fr.adaming.model.User;
import fr.adaming.repository.IRoleRepository;
import fr.adaming.repository.IUserRepository;

@Service
public class UserService implements IUserService{
	
	@Bean
	BCryptPasswordEncoder passwordEncoder() {

	    return new BCryptPasswordEncoder();
	}
	
	@Autowired
	IUserRepository userRepository;

	@Autowired
	BCryptPasswordEncoder cryptageService;
	
	

	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	
	public User getUserById(long idUser) {
		Optional<User> opUser = userRepository.findById(idUser);
		User user=opUser.get();
		return user;
	}
	
	public User getUserByIdentif(String ident) {
		return userRepository.findByIdentifUser(ident);
//		Optional<User> opUser = userRepository.findByIdentifUser(ident);
//		User user=opUser.get();
//		return user;
	}

	

	
	@Override
	public User createUser(User user) {
		if(userRepository.findByIdentifUser(user.getIdentifUser()) == null) {
			user.setMotDePass(cryptageService.encode(user.getMotDePass()));}  //matches est pour verifier la chaine de caracteres
		userRepository.save(user);
		return user;
	}

	public User updateUser(User user) {
		userRepository.save(user);
		return user;
	}

	
	public boolean removeUser(long idUser) {
		Optional<User> opUser = userRepository.findById(idUser);
		User user = opUser.get();
		userRepository.delete(user);
		System.out.println("User removed");
		return true;
	}
	
	
	@Override
	public User login(String IdentifUser, String MotDePass) {
		//User user = new User();  su manera
		//user = this.getByIdentif(IdentifUser);  su manera
		System.out.println("antes de buscar user");
		User u= new User();
		u = userRepository.findByIdentifUser(IdentifUser);
		System.out.println("despues de buscar user, que da"+u);
		if (u!=null) {
			System.out.println("userService ha encontrado algo con el mismo usuario");
		if(cryptageService.matches(MotDePass, u.getMotDePass())) {
			System.out.println("userService ha encontrado algo con la misma contrasena");
			return u;
		}
		else {
			return null;
		}
		}
		else {
			return null;
		}
	}


}
