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
import fr.adaming.model.Facture;
import fr.adaming.model.Reservation;
import fr.adaming.model.User;
import fr.adaming.service.IFactureService;
import fr.adaming.service.IUserService;

@RestController
@RequestMapping("facture")
@CrossOrigin("http://localhost:4200")
public class FactureController {
	
	@Autowired
	IFactureService factureService;
	
	@Autowired
	IUserService userService;
	

	
	@GetMapping("/all")
	public List<Facture> getAll() {
		return factureService.getAllFactures();
	}
	
	@GetMapping("/{identUs}")
	public List<Facture> getByIdentUser(@PathVariable String identUs) {  //busco user y busco facturas con user
		return factureService.getAllFacturesbyIdentUser(identUs);
	}
	

	
	@PostMapping("/parCom")
	public Facture getFactureByCom(@RequestBody Commande commande) {
		return factureService.getFactureByCommande(commande);
	}
	
	@PostMapping("/add")
	public Facture addFacture(@RequestBody Facture facture) {
		System.out.println("paso por facture controller");
		return factureService.createFacture(facture);
	}
	

}
