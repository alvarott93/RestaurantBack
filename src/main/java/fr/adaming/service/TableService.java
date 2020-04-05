package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Role;
import fr.adaming.model.Tables;
import fr.adaming.model.User;
import fr.adaming.repository.ITableRepository;

@Service
public class TableService implements ITableService{
	
	@Autowired
	ITableRepository tableRepository;
	
	public List<Tables> getAllTables() {
		return tableRepository.findAll();
	}

	
	public Tables getTableByCap(long capTables) {

		Tables table=tableRepository.findBycapTables(capTables);
		return table;
	}
	
	public Tables getTableById(long idTab) {
		Optional<Tables> opTables = tableRepository.findById(idTab);
		Tables tables=opTables.get();
		return tables;
	}

	
	public Tables createTable(Tables table) {
		tableRepository.save(table);
		return table;
	}
	
	public boolean removeTable(long idTable) {
		Optional<Tables> opTable = tableRepository.findById(idTable);
		Tables table = opTable.get();
		tableRepository.delete(table);
		System.out.println("Table removed");
		return true;
	}




}
