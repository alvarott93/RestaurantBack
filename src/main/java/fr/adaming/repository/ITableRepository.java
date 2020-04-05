package fr.adaming.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Tables;
import fr.adaming.model.User;



public interface ITableRepository extends JpaRepository<Tables, Long>{
	
	public Tables findBycapTables(long capTables);

}
