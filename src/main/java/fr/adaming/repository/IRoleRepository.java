package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Commande;
import fr.adaming.model.Pedido;
import fr.adaming.model.Plat;
import fr.adaming.model.Role;

public interface IRoleRepository extends JpaRepository<Role, Long>{

	public Role findBynomRole(String nomRole);
}
