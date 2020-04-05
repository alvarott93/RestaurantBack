package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Commande;
import fr.adaming.model.Pedido;
import fr.adaming.model.Plat;

public interface IPedidoService {
	
	public List<Pedido> getAllPedidos();
	public List<Pedido> findBycommandePedido(Commande commande);
	public Pedido createPedido(Pedido pedido);
	public Pedido findByPlatAndCommande(Plat platPedido, Commande commandePedido);
	public Pedido removePedidothroughpedido(Pedido pedido);
	public List<Pedido> getAllPedidosbyIdentUser(String identUs);

}
