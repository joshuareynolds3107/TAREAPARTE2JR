package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.entities.Categoria;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;

public class DetalleFacturaDAOImplo implements DetalleFacturaDAO {
	
	@Autowired
	
	
	private SessionFactory sessionFactory;

	@Transactional

	public List<DetalleFactura> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		
		return session.createQuery("FROM DetalleFactura", DetalleFactura.class).getResultList();
	}
	
////////////////////////////////////////////////////////////////
	@Transactional

	public DetalleFactura findOne(int id) {
		// TODO Auto-generated method stub
	Session session= sessionFactory.getCurrentSession();
	return session.get(DetalleFactura.class, id);
	}

	@Transactional
	public void add(DetalleFactura detallefactura) {
		// TODO Auto-generated method stub
		
		Session session= sessionFactory.getCurrentSession();
		session .saveOrUpdate(detallefactura);

	}

	public void up(DetalleFactura detallefactura) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session .saveOrUpdate(detallefactura);
	}

	public void del(int id) {
		// TODO Auto-generated method stub
		
		Session session= sessionFactory.getCurrentSession();
		session .delete(findOne(id));
	}

	public List<DetalleFactura> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

}
