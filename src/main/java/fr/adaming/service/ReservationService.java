package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Reservation;
import fr.adaming.model.Role;
import fr.adaming.model.User;
import fr.adaming.repository.IReservationRepository;
@Service
public class ReservationService implements IReservationService{
	
	@Autowired
	IReservationRepository reservationRepository;
	

	public List<Reservation> getAllReservations() {
		return reservationRepository.findAll();
	}

	
	public List<Reservation> getReservationsByUser(User user) {
		return reservationRepository.findByuserRes(user);
	}
	
	public Reservation getReservationById(long idReservation) {
		Optional<Reservation> opReservation = reservationRepository.findById(idReservation);
		Reservation reservation=opReservation.get();
		return reservation;
	}
	


	public Reservation createReservation(Reservation reservation) {
		reservationRepository.save(reservation);
		return reservation;
	}



	public boolean removeReservation(long idReservation) {
		Optional<Reservation> opReservation = reservationRepository.findById(idReservation);
		Reservation reservation = opReservation.get();
		reservationRepository.delete(reservation);
		System.out.println("Reservation removed");
		return true;
	}

}
