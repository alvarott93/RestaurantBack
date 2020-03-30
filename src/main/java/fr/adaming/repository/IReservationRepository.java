package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long>{

}
