package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Plat;

public interface IPlatService {

	public List<Plat> getAllPlats();
	public Plat createPlat(Plat plat);
	public boolean removePlat(long idPlat);
	public Plat getPlatById(long idPlat);

}
