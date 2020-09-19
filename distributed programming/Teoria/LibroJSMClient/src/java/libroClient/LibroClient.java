/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroClient;


import libro.*;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author ALDO
 */
public class LibroClient {
    public static void main(String[] args) throws NamingException {
        Context ctx =  new InitialContext();
        ConnectionFactory connectionFactory = (ConnectionFactory)
                    ctx.lookup("jms/javaee7/ConnectionFactory");
        
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");
        
        
        
        Libro b = new Libro("1-34838-3949-7","HP saga","JK Rowling",350);
        
        try(JMSContext jmsContext = connectionFactory.createContext()){
            jmsContext.createProducer().setProperty("id",b.getId()).send(topic,b);
        } 
    }
}
