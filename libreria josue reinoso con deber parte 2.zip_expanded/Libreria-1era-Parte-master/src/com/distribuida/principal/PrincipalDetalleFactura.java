package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.dao.DetalleFacturaDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public class PrincipalDetalleFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		DetalleFacturaDAO detallefacturaDAO =context.getBean("detallefacturaDAOImpl", DetalleFacturaDAO.class);
		ClienteDAO clienteDAO =context.getBean("clienteDAOimpl", ClienteDAO.class);
		FacturaDAO facturaDAO =context.getBean("facturaDAOimpl", FacturaDAO.class);
		LibroDAO libroDAO =context.getBean("libroDAOimpl", LibroDAO.class);
		
		//CRU
		
		//ADD
		Libro libro =libroDAO.findOne(1);
		Factura factura =facturaDAO.findOne(1);
		DetalleFactura detallefactura = new DetalleFactura (0, 3, 22.22,factura,libro);
		//detallefacturaDAO.add(detallefactura);
		
		
//////////UP
		Factura factura2 =facturaDAO.findOne(2);
		Libro libro2 = libroDAO.findOne(2);
		DetalleFactura detallefactura2 = new DetalleFactura (86, 3, 22.22,factura,libro);
		//detallefacturaDAO.up(detallefactura2);
		
		
		//BORRADO
		detallefacturaDAO.del(86);
		
		//FindAll
		
		List<DetalleFactura> detallefacturas =detallefacturaDAO.findAll();
		
		for (DetalleFactura item : detallefacturas) {
			
			System.out.println(item);
		}
		
		
		// findOne
		
				//DetalleFactura detallefactura = detallefacturaDAO.findOne(1);
				//System.out.println(detallefactura.toString());
		context.close();
		
		
		

	}

}
