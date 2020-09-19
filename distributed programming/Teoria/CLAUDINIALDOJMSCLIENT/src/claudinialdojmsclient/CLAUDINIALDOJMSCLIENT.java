/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claudinialdojmsclient;

import claudinialdo.Vino;
import java.util.Scanner;
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
public class CLAUDINIALDOJMSCLIENT {

     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException { 
        //aggiunta la variabile id
        int numero,id; 
        Vino a1;
        Scanner  in = new Scanner(System.in);
        
        Context ctx = new InitialContext();
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        
        Destination  topic = (Destination) ctx.lookup("jms/javaee7/Topic");
       
        //aggiunte righe da stampare a video
        System.out.println("Inserisci L' ID del vino da aggiornare: ");
        //la variabile prende l'input a video
        id = in.nextInt();
        System.out.println("Numero di  bottiglie da aggiungere : ");
        numero = in.nextInt();
     
      
        
        try(JMSContext jmsc = cf.createContext()){
            //modificato l' invio del  messaggio con id
            jmsc.createProducer().setProperty("bottiglie", numero).send(topic,id);
       
    }
    
    }
    }
