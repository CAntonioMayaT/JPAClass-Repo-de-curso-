package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.latam.alura.tienda.modelo.Producto;

public class PruebaDeProducto {
	public static void main(String[] args) {
		Producto celular = new Producto();
		celular.setNombre("Samsung");
		celular.setDescription("Telefono usado");
		celular.setPrecio(new BigDecimal(1000));
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tienda");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(celular);
		em.getTransaction().commit();
		em.close();
	}
}