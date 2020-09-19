/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claudinialdo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author ALDO
 */
@MessageDriven(mappedName="jms/javaee7/Topic")
public class VinoMDB implements MessageListener{

    @Inject
    VinoEJB ejb;
    @Inject
    Event<Vino> event;
    
    @Override
    public void onMessage(Message message) {
        
        try{
            //parametri per messaggio
            int numero = message.getIntProperty("bottiglie");
            int id = message.getBody(Integer.class);
            //vino da aggiornare
            Vino a1 = ejb.trovaId(id);

             
            if(a1.getGradi() > 11 && a1.getProduzione().equals("italiano"))
                    System.out.println("Modifica non effettuata per il vino "+a1.getNome()+" per scarsa gradazione");
            else {
               
                   a1.setBottiglie(a1.getBottiglie()+numero);
                   Vino temp = ejb.update(a1);
                   event.fire(a1);
                } 
        } catch (JMSException ex) {
            Logger.getLogger(VinoMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
