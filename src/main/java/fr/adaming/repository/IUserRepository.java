package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.User;

public interface IUserRepository  extends JpaRepository<User, Long>{
	
	public User findBymailUser(String mailUser);   //hay que poner el mismo nombre del atributo!!!

}


