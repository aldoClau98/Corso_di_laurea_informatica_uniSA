/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autojmsclient;

import auto.Auto;
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
public class AutoJMSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        Context ctx = new  InitialContext();
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");
        
        Auto a = new Auto("4", "diocane", "dioporco", 1, 2, 3);
        
        try (JMSContext  jmsc = cf.createContext()){
            
            jmsc.createProducer().setProperty("id", a.getId() ).send(topic,a);
            
        }    }
    
}
