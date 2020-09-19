/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstdclient;

import book.Book;
import book.BookEJBRemote;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author ALDO
 */
public class Bookstdclient {

    /**
     * @param args the command line arguments
     * @throws javax.naming.NamingException
     */
    public static void main(String[] args)  throws NamingException{
        
        Context ctx =  new InitialContext();
        BookEJBRemote bookejb = (BookEJBRemote)
                    ctx.lookup("java:global/Book/BookEJB!book.BookEJBRemote");
        
        List<Book> books=bookejb.findAllBook();
        
        for(Book b: books){
            System.out.println("Book's ID: "+b.getId());
        }
    }
    
}
