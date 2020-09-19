/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librostdclient;

import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import libro.Libro;
import libro.LibroEJBremote;

/**
 *
 * @author ALDO
 */
public class LibroStdClient {
    public static void main(String[] args) throws NamingException{
        Context ctx =  new  InitialContext();
        LibroEJBremote bookejb = (LibroEJBremote) ctx.lookup("java:global/Libro/LibroEJB!libro.LibroEJBremote");
        
        List<Libro> books = bookejb.findAll();
        
        for(Libro b: books) {
            System.out.println(b.getId());
        }
    }
    
}
