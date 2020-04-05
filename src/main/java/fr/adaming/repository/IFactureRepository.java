package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Commande;
import fr.adaming.model.Facture;
import fr.adaming.model.Reservation;


public interface IFactureRepository extends JpaRepository<Facture, Long>{

	public Facture findBycommandeFacture(Commande commandeFacture);

}
