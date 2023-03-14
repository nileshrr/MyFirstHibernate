package edu.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.dto.Account;

public class AccountDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Manoj");
    EntityManager manager = factory.createEntityManager();
    EntityTransaction transaction = manager.getTransaction();
    
    
    public void saveAccount(Account account) {
    	transaction.begin();
    	manager.persist(account);
    	transaction.commit();
    	System.out.println("Account Detalies are =>"+account.getId()+"\t"+account.getCreatedDateTime());
    }
    
    public Account findAccountById(int id) {
    	transaction.begin();
    	Account account = manager.find(Account.class, id);
    	transaction.commit();
    	return account;
    }

}
