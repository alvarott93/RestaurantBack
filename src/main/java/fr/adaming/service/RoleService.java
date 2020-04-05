package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Role;
import fr.adaming.repository.IRoleRepository;

@Service
public class RoleService implements IRoleService{
	
	@Autowired
	IRoleRepository roleRepository;
	

	
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

	
	public Role getRoleById(long idRole) {
		Optional<Role> opRole = roleRepository.findById(idRole);
		Role role=opRole.get();
		return role;
	}
	
	//////////////
	public Role getRoleBynomRole(String nomRole) {
		return roleRepository.findBynomRole(nomRole);
	}


	
	public Role createRole(Role role) {
		roleRepository.save(role);
		return role;
	}

	public Role updateRole(Role role) {
		roleRepository.save(role);
		return null;
	}

	
	public boolean removeRole(long idRole) {
		Optional<Role> opRole = roleRepository.findById(idRole);
		Role role = opRole.get();
		roleRepository.delete(role);
		System.out.println("Role removed");
		return true;
	}


}
