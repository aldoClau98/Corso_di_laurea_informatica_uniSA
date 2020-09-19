/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitorejmsclient;



import fornitoreEJBremote.Ordine;
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
public class FornitoreJMSclient {

    /**
     * @param args the command line arguments
     * @throws javax.naming.NamingException
     */
    public static void main(String[] args) throws NamingException {
       
        Context ctx = new InitialContext();
        
        ConnectionFactory connectionFactory =  (ConnectionFactory)
            ctx.lookup("jms/javaee7/ConnectionFactory");
        
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");
 
                  Ordine ordine= new Ordine(100,50);   
        try(JMSContext jms = connectionFactory.createContext()){
            jms.createProducer().setProperty("id",1).send(topic,ordine);
            System.out.println("Message send "+ ordine.toString() );
                    
                    
                    
        }
        
        
        
        }
}

   
