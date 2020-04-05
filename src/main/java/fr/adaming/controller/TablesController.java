package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Reservation;
import fr.adaming.model.Tables;
import fr.adaming.model.User;
import fr.adaming.service.IFactureService;
import fr.adaming.service.ITableService;

@RestController
@RequestMapping("table")
@CrossOrigin("http://localhost:4200")
public class TablesController {
	
	@Autowired
	ITableService tableService;
	

	

	@GetMapping("/all")
	public List<Tables> getAll() {
		return tableService.getAllTables();
	}
	
	@GetMapping("/parid/{idTab}")
	public Tables getUserById(@PathVariable long idTab) {
		return tableService.getTableById(idTab);
	}
	
	@GetMapping("/{tabcap}")
	public Tables getTablebyCaptab(@PathVariable long tabcap) {
		return tableService.getTableByCap(tabcap);
	}

	
	
	@PostMapping("/add")
	public Tables addTable(@RequestBody Tables tables) {
		return tableService.createTable(tables);
	}
	

	
	@PostMapping("/delete/{idtab}")
	public boolean deleteTable(@PathVariable long idtab) {
		tableService.removeTable(idtab);
		return true;
	}

}
