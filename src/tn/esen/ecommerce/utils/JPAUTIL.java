package tn.esen.ecommerce.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


// on fait ce class car on n'a pas utiliser spring 
public class JPAUTIL {
	
	private static final EntityManager entityManager;
	
	static {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("jpa-formation");
		entityManager=em.createEntityManager();
	}
	
	public static EntityManager getEntityManager(){
		return entityManager;
	}

}
