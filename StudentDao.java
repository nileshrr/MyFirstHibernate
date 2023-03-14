package edu.jsp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.dto.Student;

public class StudentDao {
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(101);
		student.setName("rinda");
		student.setAge(21);
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("Manoj");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transction = manager.getTransaction();
		transction.begin();
		manager.persist(student);
		transction.commit();
		
	}


}
