package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Tables;

public interface ITableService {
	
	public List<Tables> getAllTables();
	public Tables getTableByCap(long capTables);
	public Tables createTable(Tables table);
	public boolean removeTable(long idTable);
	public Tables getTableById(long idTab);

}
