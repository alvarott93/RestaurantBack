package fr.adaming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Commande;
import fr.adaming.model.Facture;
import fr.adaming.model.Pedido;
import fr.adaming.model.Plat;
import fr.adaming.model.Role;
import fr.adaming.repository.ICommandeRepository;
import fr.adaming.repository.ILoginRepository;
import fr.adaming.repository.IPedidoRepository;

@Service
public class PedidoService implements IPedidoService{
	
	@Autowired
	IPedidoRepository pedidoRepository;
	
	@Autowired
	ICommandeRepository commandeRepository;
	
	
	public List<Pedido> getAllPedidos() {
		return pedidoRepository.findAll();
	}

	
	public List<Pedido> findBycommandePedido(Commande commande) {
		return pedidoRepository.findBycommandePedido(commande);
	}
	

	//ESTEEEEEE
	public List<Pedido> getAllPedidosbyIdentUser(String identUs) {
		List<Pedido> liste1=pedidoRepository.findAll();
		List<Pedido> liste2=new ArrayList<>();
		List<Commande> liste3=commandeRepository.findAll();
		 Pedido ped=new Pedido();
		for (int i=0; i<liste3.size(); i++) {
			for (int j=0; j<liste1.size(); j++) {
			     ped=liste1.get(j);
			      if (ped.getCommandePedido().getReservCommande().getUserRes().getIdentifUser().equals(identUs)) {
				    liste2.add(ped); }   //pedidos ordenados por facturas (o por commandes, es lo mismo)
			        }
		          }
		return liste2;
	}
	
	//ejemplo para copiar
//	public List<Facture> getAllFacturesbyIdentUser(String identUs) {
//		System.out.println("llego a getfactures en factureservice");
//		List<Facture> liste1=factureRepository.findAll();
//		List<Facture> liste2= new ArrayList<>();
//		 Facture fact=new Facture();
//		 System.out.println("tamano de la lista es "+liste1.size());
//		for (int i=1; i<liste1.size(); i++) {
//			System.out.println("primer loop i es: "+i);
//			fact=liste1.get(i);
//			System.out.println("la factura guardada es "+fact);
//			if (fact!=null) {
//				
//			if (fact.getCommandeFacture().getReservCommande().getUserRes().getIdentifUser().equals(identUs) && fact.getPrixTotal()!=0) {
//				System.out.println("la factura que entra en el if  es "+fact);
//				System.out.println("aanado una factura con el user deseado");
//				liste2.add(fact);
//			} }
//		}
//		return liste2;
//	}
	
	
//	public List<Pedido> findByPlat(Plat plat) {
//		return pedidoRepository.findBycommandePedido(commande);
//	}
	
	public Pedido findByPlatAndCommande(Plat platPedido, Commande commandePedido) {
		Pedido pedido = pedidoRepository.findByPlatPedidoAndCommandePedido(platPedido, commandePedido);
		if (pedido==null) {
			return null;
		}
		else {
			return pedido;
		}
	}

	
	public Pedido createPedido(Pedido pedido) {
		pedidoRepository.save(pedido);
		return pedido;
	}


	
	public boolean removePedido(Commande commande) {
		List<Pedido> opPedido = pedidoRepository.findBycommandePedido(commande);
		for (Pedido pe : opPedido) {
			pedidoRepository.delete(pe);
		}
		System.out.println("Pedido removed");
		return true;
	}
	
	public Pedido removePedidothroughpedido(Pedido pedido) {
		pedidoRepository.delete(pedido);
		System.out.println("Pedido removed");
		return pedido;   //igual esto puede dar fallo...
	}


}
