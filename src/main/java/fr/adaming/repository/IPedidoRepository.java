package fr.adaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository; //yo...
import fr.adaming.model.Commande;
import fr.adaming.model.Pedido;
import fr.adaming.model.Plat;
import fr.adaming.model.Reservation;
import fr.adaming.model.User;

import org.springframework.data.jpa.repository.Query;  //yo...


public interface IPedidoRepository extends JpaRepository<Pedido, Long>  {
	
	public List<Pedido> findBycommandePedido(Commande commandePedido); 
	//public Pedido findByplatPedido(Plat platPedido);
	//public Pedido findByplatPedidoAndcommandePedido(Plat platPedido, Commande commandePedido);  //era problema de mayusculas!!!!
	public Pedido findByPlatPedidoAndCommandePedido(Plat platPedido, Commande commandePedido);

	
}
