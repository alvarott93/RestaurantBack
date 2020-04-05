package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Reservation;
import fr.adaming.model.User;

public interface IReservationService {
	
	public List<Reservation> getAllReservations();
	public List<Reservation> getReservationsByUser(User user);
	public Reservation createReservation(Reservation reservation);
	public boolean removeReservation(long idReservation);
	public Reservation getReservationById(long idReservation);
	

}
