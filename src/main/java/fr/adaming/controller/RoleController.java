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

import fr.adaming.model.Role;
import fr.adaming.service.IRoleService;


@RestController
@RequestMapping("role")
@CrossOrigin("http://localhost:4200")
public class RoleController {
	
	@Autowired
	IRoleService roleService;
	
	@GetMapping("/all")
	public List<Role> getAll() {
		return roleService.getAllRoles();
	}
	
	@GetMapping("/{idRole}")
	public Role getById(@PathVariable long idRole) {
		return roleService.getRoleById(idRole);
	}
	
	@GetMapping("/name/{nomRole}")
	public Role getBynom(@PathVariable String nomRole) {
		return roleService.getRoleBynomRole(nomRole);
	}
	
	
	@PostMapping("/add")
	public Role addRole(@RequestBody Role role) {
		return roleService.createRole(role);
	}
	
	@PutMapping("/update")
	public Role updateRole(@RequestBody Role role) {
		return roleService.updateRole(role);
	}
	
	@DeleteMapping("/delete/{idR}")
	public boolean removeRole(@PathVariable long idR) {
	roleService.removeRole(idR);
	return true;
     }


}




