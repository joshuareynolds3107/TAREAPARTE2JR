package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO =context.getBean("clienteDAOimpl", ClienteDAO.class);
		
		
		//add
		Cliente cliente2 =new Cliente(0,"0102030405", "Jefferson", "Gutierritos","Quito","0987654321","jgutierritos@correo.com");
		
		clienteDAO.add(cliente2);
		
		Cliente cliente3 =new Cliente(39,"0102032233", "Pamela", "Gutierritos","Quito","0987651234","pgutierritos@correo.com");
	//	clienteDAO.up(cliente3);
		
		clienteDAO.del(39);
		
		List<Cliente> clientes =clienteDAO.findAll();
		
		Cliente cliente = clienteDAO.findOne(1);
		
		for (Cliente item : clientes) {
			
			System.out.println(item.toString());
		}
		
		//System.out.println(cliente.toString());
		
		context .close();

	}
	
}
