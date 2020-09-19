/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museojmsclient;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import museo.Museo;


/**
 *
 * @author ALDO
 */
public class MuseoJMSCLient {

    /**
     * @param args the command line arguments
     * @throws javax.naming.NamingException
     */
    
    
    public static void main(String[] args) throws NamingException {
        
       Context ctx = new InitialContext();
       
       ConnectionFactory  cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
       
       Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");
       
       Museo m = new Museo("3", "museo2", "giacomo", "palermo", "PA", "Sicilia", 300, 2003);
       
       try(JMSContext jmsc =  cf.createContext()){

            jmsc.createProducer().send(topic, m);
        
        
    }
    }
}
