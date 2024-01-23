package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="detalle_factura")
public class DetalleFactura {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_factura_detalle")
	private int idaDetalleFactura;
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="subtotal")
	private Double subTotal;
		
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="id_factura")
	private Factura factura;
	
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="id_libro")
	private Libro libro;
	
	public DetalleFactura (){}
	
	
	
		public DetalleFactura(int idaDetalleFactura, int cantidad, Double subTotal, Factura factura, Libro libro) {
		this.idaDetalleFactura = idaDetalleFactura;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
		this.factura = factura;
		this.libro = libro;
	}







	public int getIdaDetalleFactura() {
		return idaDetalleFactura;
	}

	public void setIdaDetalleFactura(int idaDetalleFactura) {
		this.idaDetalleFactura = idaDetalleFactura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String toString() {
		return "DetalleFactura [idaDetalleFactura=" + idaDetalleFactura + ", cantidad=" + cantidad + ", subTotal="
				+ subTotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
	

}
