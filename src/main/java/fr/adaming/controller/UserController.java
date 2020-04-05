package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Login;
import fr.adaming.model.User;
import fr.adaming.service.IUserService;


@RestController
@RequestMapping("user")
@CrossOrigin("http://localhost:4200")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping("/all")
	public List<User> getAll() {
		return userService.getAllUsers();
	}

	@GetMapping("/{idU}")
	public User getUserById(@PathVariable long idU) {
		return userService.getUserById(idU);
	}
	
	@GetMapping("/ident/{iden}")
	public User getUserByIdent(@PathVariable String iden) {
		return userService.getUserByIdentif(iden);
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PostMapping("/login")     
	public User verifUser(@RequestBody Login login) {
		return userService.login(login.getIdentifUser(), login.getMotDePass());
	}
	
	

	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@PostMapping("/delete/{idU}")
	public boolean deleteUser(@PathVariable long idU) {
		userService.removeUser(idU);
		return true;
	}
	
	

}
