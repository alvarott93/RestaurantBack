package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Commande;
import fr.adaming.model.Reservation;

public interface ICommandeService {
	
	public List<Commande> getAllCommandes();
	public Commande getCommandeByReservation(Reservation reserv);
	public Commande createCommande(Commande commande);
	public boolean removeCommande(long idCommande);
	public Commande getCommandeById(long idCommande);

}
