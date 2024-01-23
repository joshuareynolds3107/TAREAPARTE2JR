package com.distribuida.principal;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO=context.getBean("autorDAOimpl", AutorDAO.class);
		
		//CRUD
		
		//ADD
		Autor autor = new Autor (0, "nombre1", "apellido1", "pais1", "direccion1", "telefono1", "correo1");
		//autorDAO.add(autor);
		
		//////////UP
		
		Autor autor2 = new Autor (56, "nombre2", "apellido2", "pais2", "direccion2", "telefono2", "correo2");
		autorDAO.up(autor2);
		
		
		//////////////DEL
		
		//autorDAO.del(55);
		
		//findAll
			
		List<Autor> autores = autorDAO.findAll();
		
		for (Autor item : autores) {
			System.out.println(item.toString());
		}
		
			
		///////findOne
		
		//Autor autor = autorDAO.findOne(1);
		//System.out.println(autor.toString());
		
		
		/*List<Autor> autores2 = autorDAO.findAll("pam");
		for(Autor autor3: autores2) {
			System.out.println(autor3.toString());	
		}*/
		
		context.close();

	}
	
}
