/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Customer;
import javax.persistence.EntityManagerFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author karlf
 */
public class CustomerFacadeTest {
    
    public CustomerFacadeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCustomerFacade method, of class CustomerFacade.
     */
    @Test
    public void testGetCustomerFacade() {
        System.out.println("getCustomerFacade");
        EntityManagerFactory _emf = null;
        CustomerFacade expResult = null;
        CustomerFacade result = CustomerFacade.getCustomerFacade(_emf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findByID method, of class CustomerFacade.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        int id = 1;
        CustomerFacade instance = null;
        Customer expResult = null;
        Customer result = instance.findByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
