package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Commande;
import fr.adaming.model.Facture;

public interface IFactureService {
	
	public List<Facture> getAllFactures();
	public Facture getFactureByCommande(Commande commande);
	public Facture createFacture(Facture facture);
	public List<Facture> getAllFacturesbyIdentUser(String identUs);
}
