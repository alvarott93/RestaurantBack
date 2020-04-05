package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Commande;
import fr.adaming.model.Facture;
import fr.adaming.model.Pedido;
import fr.adaming.model.Plat;
import fr.adaming.model.Tables;
import fr.adaming.model.User;
import fr.adaming.service.ICommandeService;
import fr.adaming.service.IFactureService;
import fr.adaming.service.IPedidoService;
import fr.adaming.service.IPlatService;


@RestController
@RequestMapping("pedido")
@CrossOrigin("http://localhost:4200")
public class PedidoController {
	
	@Autowired
	IPedidoService pedidoService;
	@Autowired
	IPlatService platService;
	@Autowired
	ICommandeService commandeService;
	@Autowired
	IFactureService factureService;
	

	
	@GetMapping("/all")
	public List<Pedido> getAll() {
		return pedidoService.getAllPedidos();
	}
	
	
	@PostMapping("/parCom")
	public List<Pedido> getPedidoByPed(@RequestBody Commande commande) {
		return pedidoService.findBycommandePedido(commande);
	}
	

	//salen ordenados en teoria!!
	@GetMapping("/{identUs}")
	public List<Pedido> getByIdentUser(@PathVariable String identUs) {  //busco user y busco facturas con user
		return pedidoService.getAllPedidosbyIdentUser(identUs);
	}
	
	
	//cambio este!!!!!
	@GetMapping("/parPlatandCom/{idCom}/{idPla}")  //cambiar a Pedido
	public Pedido getPedidoByplatoycomanda(@PathVariable long idCom, @PathVariable long idPla) {
		Plat platPedido = platService.getPlatById(idPla);
		Commande commandePedido=commandeService.getCommandeById(idCom);
		return pedidoService.findByPlatAndCommande(platPedido, commandePedido);
	}
	


	
	@PostMapping("/add")
	public Pedido addPedido(@RequestBody Pedido pedido) {
		return pedidoService.createPedido(pedido);
	}
	
	@PostMapping("/delete")
	public Pedido removePedido(@RequestBody Pedido pedido) {
		return pedidoService.removePedidothroughpedido(pedido);
	}

}
