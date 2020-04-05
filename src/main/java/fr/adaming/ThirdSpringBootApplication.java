package fr.adaming;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.adaming.controller.UserController;
import fr.adaming.model.Commande;
import fr.adaming.model.Facture;
import fr.adaming.model.Login;
import fr.adaming.model.Pedido;
import fr.adaming.model.Plat;
import fr.adaming.model.Reservation;
import fr.adaming.model.Role;
import fr.adaming.model.Tables;
import fr.adaming.model.User;
import fr.adaming.service.ICommandeService;
import fr.adaming.service.IFactureService;
import fr.adaming.service.ILoginService;
import fr.adaming.service.IPedidoService;
import fr.adaming.service.IPlatService;
import fr.adaming.service.IReservationService;
import fr.adaming.service.IRoleService;
import fr.adaming.service.ITableService;
import fr.adaming.service.IUserService;

@SpringBootApplication
public class ThirdSpringBootApplication implements CommandLineRunner{
	
	@Autowired
	ICommandeService commandeService;
	@Autowired
	IFactureService factureService;
	@Autowired
	ILoginService loginService;
	@Autowired
	IPlatService platService;
	@Autowired
	IReservationService reservationService;
	@Autowired
	IRoleService roleService;
	@Autowired
	ITableService tableService;
	@Autowired
	IUserService userService;
	@Autowired
	IPedidoService pedidoService;

	
	@Autowired
	UserController usercontroller;
	
	
	//@Autowired
	//UserController usercontroller;

	public static void main(String[] args) {
		SpringApplication.run(ThirdSpringBootApplication.class, args);
		
		System.out.println("ça marche");
		System.err.println("ça marche");
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("third spring project running");
//  
//	System.out.println("ça marche2");
	System.err.println("ça marche2");
//	
//	Role role1=new Role("Client");
//	roleService.createRole(role1);
//	Role role2=new Role("Serveur");
//	roleService.createRole(role2);
//	Role role3=new Role("Manager");
//	roleService.createRole(role3);
//	User user1= new User("alvaro", "Toribio", "Alvaro", "mail@", "pass1", role1);
//	User user2= new User("pablo", "Toribio", "Pablo", "mail@", "pass1", role2);
//	User user3= new User("rodrigo", "Toribio", "Rodrigo", "mail@", "pass1", role3);
//	User user4= new User("testo", "Toribio", "Alvaro", "mail@", "pass1", role1);
//	userService.createUser(user1);
//	userService.createUser(user2);
//	userService.createUser(user3);
//	userService.createUser(user4);
//	Plat plat1= new Plat("Beans", "-", 20); 
//	Plat plat2= new Plat("Cake", "-", 10.5); 
//	platService.createPlat(plat1);
//	platService.createPlat(plat2);
//	Reservation reser1 = new Reservation(null, 7, user1);
//	reservationService.createReservation(reser1);
//	
//	
//	Commande commande1= new Commande("-", reser1);
//	
//	commandeService.createCommande(commande1);
//	
//	Pedido lineapedido1=new Pedido(commande1, plat1, 3);
//	Pedido lineapedido2=new Pedido(commande1, plat2, 4);
//	Facture facture1=new Facture();
//	factureService.createFacture(facture1);
//	Pedido lineapedido3=new Pedido(commande1, facture1, plat2, 4);  //eliminar esto si fallaaaaa
//	pedidoService.createPedido(lineapedido1);
//	pedidoService.createPedido(lineapedido2);
//	pedidoService.createPedido(lineapedido3);
//		
//		Login log1 = new Login("alvaro", "pass1");
//
//		System.out.println("test7");
//		System.out.println(usercontroller.verifUser(log1));
//	
//     
//	
//	Plat platPedido=platService.getPlatById(1);
//	System.out.println(platPedido);
//	Commande commandePedido=commandeService.getCommandeById(1);
//	System.out.println(commandePedido);
//	Pedido pedido=pedidoService.findByPlatAndCommande(platPedido, commandePedido);
//	System.out.println("here");
//	System.out.println(pedidoService.findByPlatAndCommande(platPedido, commandePedido));
//	
//	Tables table1=new Tables(2, 1);
//	Tables table2=new Tables(3, 1);
//	Tables table3=new Tables(4, 1);
//	Tables table4=new Tables(5, 1);
//	tableService.createTable(table1);
//	tableService.createTable(table2);
//	tableService.createTable(table3);
//	tableService.createTable(table4);
	
	//List<Facture> liste=factureService.getAllFacturesbyIdentUser("alvaro"); //este funciona
//	List<Pedido> liste2=pedidoService.getAllPedidosbyIdentUser("alvaro"); //
//	System.out.println(liste2);
	
	
}
}
