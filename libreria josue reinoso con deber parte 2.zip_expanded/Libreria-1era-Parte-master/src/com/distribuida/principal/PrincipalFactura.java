package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FacturaDAO facturaDAO =context.getBean("facturaDAOImpl", FacturaDAO.class);
		ClienteDAO clienteDAO =context.getBean("clienteDAOimpl", ClienteDAO.class);
		
		//CRU
		
		//ADD
		Cliente cliente =clienteDAO.findOne(1);
		Factura factura = new Factura (0, "fac-00090",new Date(), 22.22,2.30,25.23,cliente);
		//facturaDAO.add(factura);
		
		
//////////UP
		Cliente cliente2 =clienteDAO.findOne(2);
		Factura factura2 = new Factura (86, "fac-00090",new Date(), 23.22,2.33,25.233,cliente2);
		//facturaDAO.up(factura2);
		
		
		//BORRADO
		facturaDAO.del(86);
		
		//FindAll
		
		List<Factura> facturas =facturaDAO.findAll();
		
		for (Factura item : facturas) {
			
			System.out.println(item);
		}
		
		
		// findOne
		
				//Factura factura = facturaDAO.findOne(1);
				//System.out.println(factura.toString());
		context.close();
		
		
		

	}

}
