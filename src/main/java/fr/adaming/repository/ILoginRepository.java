package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.adaming.model.Login;

public interface ILoginRepository extends JpaRepository<Login, Long>  {

}
