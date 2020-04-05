package fr.adaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Reservation;
import fr.adaming.model.User;

public interface IReservationRepository extends JpaRepository<Reservation, Long>{
	
	public List<Reservation> findByuserRes(User userRes); 

}
