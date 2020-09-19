/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookwebserviceclient;

import book.Book;
import book.BookEJBService;
import java.util.List;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author ALDO
 */
public class Main {

    private static BookEJBService service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Book> books = findAllBook();
        
        for(Book b : books){
            System.out.println(b.getAuthor());
        }
    }

    private static java.util.List<book.Book> findAllBook() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        book.BookEJB port = service.getBookEJBPort();
        return port.findAllBook();
    }

 
    
}
