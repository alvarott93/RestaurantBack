package fr.adaming.service;

import java.util.List;


import fr.adaming.model.User;

public interface IUserService {
	
	 public List<User> getAllUsers();
	 public User getUserById(long idUser);
	 public User createUser(User user);
	 public User updateUser(User user);
	 public boolean removeUser(long idUser);
	 public User login(String IdentifUser, String MotDePass);
	 public User getUserByIdentif(String ident);

}
