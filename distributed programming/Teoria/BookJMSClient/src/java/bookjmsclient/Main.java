/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookjmsclient;

import book.Book;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author ALDO
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws javax.naming.NamingException
     */
    public static void main(String[] args) throws NamingException {
       
        Context ctx =  new InitialContext();
        ConnectionFactory cf = (ConnectionFactory)
                    ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination)
                ctx.lookup("jms/javaee7/Topic");
        Book b = new  Book("1","pippo","pluto",445);
        try(JMSContext jmsc = cf.createContext()){
            jmsc.createProducer().setProperty("id",b.getId()).send(topic,b);
            System.out.println("Message send "+ b.toString() );
        }    }
    
}
