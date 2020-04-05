package fr.adaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Commande;
import fr.adaming.model.Reservation;
import fr.adaming.model.User;



public interface ICommandeRepository extends JpaRepository<Commande, Long>{
	
	public Commande findByreservCommande(Reservation reservCommande);
	

}
