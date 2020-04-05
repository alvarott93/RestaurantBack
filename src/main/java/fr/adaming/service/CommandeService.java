package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Commande;
import fr.adaming.model.Plat;
import fr.adaming.model.Reservation;
import fr.adaming.model.Role;
import fr.adaming.model.User;
import fr.adaming.repository.ICommandeRepository;
import fr.adaming.repository.IReservationRepository;

@Service
public class CommandeService implements ICommandeService{
	

	@Autowired
	ICommandeRepository commandeRepository;
	

	public List<Commande> getAllCommandes() {
		return commandeRepository.findAll();
	}
	
	public Commande getCommandeById(long idCommande) {
		Optional<Commande> opCommande = commandeRepository.findById(idCommande);
		Commande commande=opCommande.get();
		return commande;
	}

	
	public Commande getCommandeByReservation(Reservation reserv) {
		return commandeRepository.findByreservCommande(reserv);
	}

	public Commande createCommande(Commande commande) {
		commandeRepository.save(commande);
		return commande;
	}



	public boolean removeCommande(long idCommande) {
		Optional<Commande> opCommande = commandeRepository.findById(idCommande);
		Commande commande = opCommande.get();
		commandeRepository.delete(commande);
		System.out.println("Commanderemoved");
		return true;
	}

}
