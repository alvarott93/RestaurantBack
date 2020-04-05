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

import fr.adaming.model.Login;
import fr.adaming.model.Plat;
import fr.adaming.model.User;
import fr.adaming.service.IFactureService;
import fr.adaming.service.IPlatService;

@RestController
@RequestMapping("plat")
@CrossOrigin("http://localhost:4200")
public class PlatController {
	
	@Autowired
	IPlatService platService;
	
	

	@GetMapping("/all")
	public List<Plat> getAll() {
		return platService.getAllPlats();
	}
	
	@GetMapping("/{idPl}")
	public Plat getPlatById(@PathVariable long idPl) {
		return platService.getPlatById(idPl);
	}

	
	
	@PostMapping("/add")
	public Plat addPlat(@RequestBody Plat plat) {
		return platService.createPlat(plat);
	}
	

	
	@PostMapping("/delete/{idP}")
	public boolean deletePlat(@PathVariable long idP) {
		System.out.println("llego a  spring controller");
		platService.removePlat(idP);
		return true;
	}
	


}
