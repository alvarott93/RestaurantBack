package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Commande;
import fr.adaming.model.Pedido;
import fr.adaming.model.Plat;
import fr.adaming.model.Reservation;
import fr.adaming.model.Role;
import fr.adaming.model.User;
import fr.adaming.service.IFactureService;
import fr.adaming.service.IReservationService;

@RestController
@RequestMapping("reservation")
@CrossOrigin("http://localhost:4200")
public class ReservationController {
	
	@Autowired
	IReservationService reservationService;
	

	@GetMapping("/all")
	public List<Reservation> getAll() {
		return reservationService.getAllReservations();
	}
	
	@PostMapping("/parUser")
	public List<Reservation> getReservbyUser(@RequestBody User user) {
		return reservationService.getReservationsByUser(user);
	}
	
	@GetMapping("/{idReservation}")
	public Reservation getById(@PathVariable long idReservation) {  
		return reservationService.getReservationById(idReservation);
	}
	


	
	
	@PostMapping("/add")
	public Reservation addReservation(@RequestBody Reservation reservation) {
		return reservationService.createReservation(reservation);
	}
	

	
	@DeleteMapping("/delete/{idRes}")
	public boolean deleteReservation(@PathVariable long idRes) {
		reservationService.removeReservation(idRes);
		return true;
	}

}
