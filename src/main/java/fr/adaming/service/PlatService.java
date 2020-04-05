package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Plat;
import fr.adaming.model.Role;
import fr.adaming.repository.IPlatRepository;
import fr.adaming.repository.IRoleRepository;

@Service
public class PlatService implements IPlatService{
	
	@Autowired
	IPlatRepository platRepository;
	

	
	public List<Plat> getAllPlats() {
		return platRepository.findAll();
	}
	
	public Plat getPlatById(long idPlat) {
		Optional<Plat> opPlat = platRepository.findById(idPlat);
		Plat plat=opPlat.get();
		return plat;
	}



	
	public Plat createPlat(Plat plat) {
		platRepository.save(plat);
		return plat;
	}



	
	public boolean removePlat(long idPlat) {
		Optional<Plat> opPlat = platRepository.findById(idPlat);
		Plat plat = opPlat.get();
		platRepository.delete(plat);
		System.out.println("Plat removed");
		return true;
	}


}
