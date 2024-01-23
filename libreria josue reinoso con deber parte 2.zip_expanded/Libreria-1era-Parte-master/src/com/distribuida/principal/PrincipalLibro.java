package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.AutorDAO;

public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		LibroDAO libroDAO =context.getBean("libroDAOImpl", LibroDAO.class);
		CategoriaDAO categoriaDAO =context.getBean("categoriaDAOimpl", CategoriaDAO.class);
		AutorDAO autorDAO =context.getBean("autorDAOimpl", AutorDAO.class);
		
		//CRU
		
				//ADD
				Categoria categoria =categoriaDAO.findOne(1);
				Autor autor =autorDAO.findOne(1);
				Libro libro = new Libro (0,"Pinocho","niles",200,"2th","español",new Date(),"ficcion","pasra blanda","768-123456789","5","portada","fisica", 22.22,categoria,autor);
				//libroDAO.add(libro);
				
		/////////UP
				
				Categoria categoria2 =categoriaDAO.findOne(2);
				Autor autores2 =autorDAO.findOne(2);
				Libro libro2 = new Libro (80,"Pinocho","mieles",200,"2th","español",new Date(),"cuento","pasta blanda","768-123456789","5","portada","infantil", 40.22,categoria2,autores2);
				libroDAO.up(libro2);
				
				//BORRADO
				libroDAO.del(86);
				
				
				//FindAll
				
				List<Libro> libros =libroDAO.findAll();
				
				for (Libro item : libros) {
					
					//System.out.println(item);
				}
				
				
				// findOne
				
						//Libro libro = libroDAO.findOne(1);
						//System.out.println(libro.toString());
				context.close();
				
				

	}

}
