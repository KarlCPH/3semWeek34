/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbfacade;

import entity.Book;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author karlf
 */
public class FacadeRunner {
    
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");      
    BookFacade facade = BookFacade.getBookFacade(emf);
    Book b1 = facade.addBook("Author 1");
    Book b2 = facade.addBook("Author 2");
    //Find book by ID
    System.out.println("Book1: "+facade.findBook(b1.getId()).getAuthor());
    System.out.println("Book2: "+facade.findBook(b2.getId()).getAuthor());
    //Find all books
    System.out.println("Number of books: "+facade.getAllBooks().size());

    }
    
}
