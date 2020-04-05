package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_pedido")
public class Pedido {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_pedido")
	private long idPedido;
	@JoinColumn(name="id_commande")
	@ManyToOne
	private Commande commandePedido;
	@JoinColumn(name="id_facture")
	@ManyToOne
	private Facture facturePedido;
	@JoinColumn(name="id_plat")
	@ManyToOne
	private Plat platPedido;
	private long quantityPlatpedido;
	
	public Pedido() {
		super();
	}

	public Pedido(Commande commandePedido, Plat platPedido, long quantityPlatpedido) {
		super();
		this.commandePedido = commandePedido;
		this.platPedido = platPedido;
		this.quantityPlatpedido = quantityPlatpedido;
	}
	
	

	public Pedido(Commande commandePedido, Facture facturePedido, Plat platPedido, long quantityPlatpedido) {
		super();
		this.commandePedido = commandePedido;
		this.facturePedido = facturePedido;
		this.platPedido = platPedido;
		this.quantityPlatpedido = quantityPlatpedido;
	}

	public long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public Commande getCommandePedido() {
		return commandePedido;
	}

	public void setCommandePedido(Commande commandePedido) {
		this.commandePedido = commandePedido;
	}

	public Plat getPlatPedido() {
		return platPedido;
	}

	public void setPlatPedido(Plat platPedido) {
		this.platPedido = platPedido;
	}

	public long getQuantityPlatpedido() {
		return quantityPlatpedido;
	}

	public void setQuantityPlatpedido(long quantityPlatpedido) {
		this.quantityPlatpedido = quantityPlatpedido;
	}

	
	
	public Facture getFacturePedido() {
		return facturePedido;
	}

	public void setFacturePedido(Facture facturePedido) {
		this.facturePedido = facturePedido;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", commandePedido=" + commandePedido + ", platPedido=" + platPedido
				+ ", quantityPlatpedido=" + quantityPlatpedido + "]";
	}
	
	

}
