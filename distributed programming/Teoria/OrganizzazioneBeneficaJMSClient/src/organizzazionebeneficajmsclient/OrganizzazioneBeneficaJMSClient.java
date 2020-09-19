package organizzazionebeneficajmsclient;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class OrganizzazioneBeneficaJMSClient {

    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        
        ConnectionFactory connectionFactory = (ConnectionFactory)
                ctx.lookup("jms/javaee7/ConnectionFactory");
        
        Destination topic = (Destination) 
                ctx.lookup("jms/javaee7/Topic");
        
        long id = 1;
        int numeroDonatori = 3000; 
        try(JMSContext jmsContext = connectionFactory.createContext()){
            jmsContext.createProducer().setProperty("id", id).send(topic, numeroDonatori);
            
            System.out.println("Message sent id:" + id + ", visitors:"+ numeroDonatori);
        }
    }
    
}
