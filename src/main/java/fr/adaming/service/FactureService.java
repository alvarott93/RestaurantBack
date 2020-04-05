package fr.adaming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Commande;
import fr.adaming.model.Facture;
import fr.adaming.model.Role;
import fr.adaming.repository.IFactureRepository;
import fr.adaming.repository.IRoleRepository;

@Service
public class FactureService implements IFactureService{
	
	@Autowired
	IFactureRepository factureRepository;
	

	
	public List<Facture> getAllFactures() {
		return factureRepository.findAll();
	}
	
	
	public List<Facture> getAllFacturesbyIdentUser(String identUs) {
		System.out.println("llego a getfactures en factureservice");
		List<Facture> liste1=factureRepository.findAll();
		List<Facture> liste2= new ArrayList<>();
		 Facture fact=new Facture();
		 System.out.println("tamano de la lista es "+liste1.size());
		for (int i=1; i<liste1.size(); i++) {
			System.out.println("primer loop i es: "+i);
			fact=liste1.get(i);
			System.out.println("la factura guardada es "+fact);
			if (fact!=null) {
				
			if (fact.getCommandeFacture().getReservCommande().getUserRes().getIdentifUser().equals(identUs) && fact.getPrixTotal()!=0) {
				System.out.println("la factura que entra en el if  es "+fact);
				System.out.println("aanado una factura con el user deseado");
				liste2.add(fact);
			} }
		}
		return liste2;
	}
	
	

	
	public Facture getFactureByCommande(Commande commande) {

		return factureRepository.findBycommandeFacture(commande);
	}
	
	public Facture  createFacture(Facture  facture) {
		System.out.println("paso por facture service 1");
		factureRepository.save(facture);
		System.out.println("paso por facture service 2");
		return facture;
	}


}
