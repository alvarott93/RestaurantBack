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

import fr.adaming.model.Commande;
import fr.adaming.model.Reservation;
import fr.adaming.model.Role;
import fr.adaming.service.ICommandeService;


@RestController
@RequestMapping("commande")
@CrossOrigin("http://localhost:4200")
public class CommandeController {
	
	@Autowired
	ICommandeService commandeService;
	
	@GetMapping("/all")
	public List<Commande> getAll() {
		return commandeService.getAllCommandes();
	}
	
	@PostMapping("/parreserv")
	public Commande getByReservation(@RequestBody Reservation reservation) {
		return commandeService.getCommandeByReservation(reservation);
	}
	
	@PostMapping("/add")
	public Commande addCommande(@RequestBody Commande commande) {
		return commandeService.createCommande(commande);
	}
	

	
	@PutMapping("/update")
	public Commande updateCommande(@RequestBody Commande commande) {
		return commandeService.createCommande(commande);
	}
	
	@DeleteMapping("/delete/{idCom}")
	public boolean removeCommande(@PathVariable long idCom) {
	commandeService.removeCommande(idCom);
	return true;
     }

}
