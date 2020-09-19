/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canzonejmsclient;

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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
      Context ctx =  new InitialContext();
      ConnectionFactory cFactory =  (ConnectionFactory)
      ctx.lookup("jms/javaee7/ConnectionFactory");
      Destination  topic = (Destination) ctx.lookup("jms/javaee7/Topic");
        int id=1;
        String c="Sai che cosa penso";
        try(JMSContext jms =  cFactory.createContext()){
           jms.createProducer().setProperty("id", id).send(topic, c);
           
           System.out.println("Mesaggio inviato Nome: "+id+"Testo: "+c);
  
        }
        
    }
    
}
