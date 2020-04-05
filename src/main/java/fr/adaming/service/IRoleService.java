package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Role;

public interface IRoleService {
	
	 public List<Role> getAllRoles();
	 public Role getRoleById(long idRole);
	 public Role createRole(Role role);
	 public Role updateRole(Role role);
	 public boolean removeRole(long idRole);
	 public Role getRoleBynomRole(String nomRole);

}
