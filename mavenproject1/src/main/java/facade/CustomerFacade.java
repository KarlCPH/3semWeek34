/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author karlf
 */
public class CustomerFacade {
    
    private static EntityManagerFactory emf;
    private static CustomerFacade instance;

    private CustomerFacade() {}
    
    public static CustomerFacade getCustomerFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new CustomerFacade();
        }
        return instance;
    }
    
    
    
    public Customer findByID(int id){
         EntityManager em = emf.createEntityManager();
        try{
            Customer customer = em.find(Customer.class,id);
            return customer;
        }finally {
            em.close();
        }
    }  
}
    