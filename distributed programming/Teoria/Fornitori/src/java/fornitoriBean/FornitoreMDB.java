/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitoriBean;
import fornitoreEJBremote.Ordine;
import java.awt.Event;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
/**
 *
 * @author ALDO
 */
@MessageDriven( mappedName="jms/javaee7/Topic")
public class FornitoreMDB implements MessageListener {
    
    @Inject
    FornitoreEJB ejb;
 
   
    @Override
    public void onMessage(Message message) {

        int id;
       
        try {
             id = message.getIntProperty("id");
            Ordine ordine = message.getBody(Ordine.class);
        
        
          Fornitore f = ejb.findId(id);
          
          
          if(f.incrementaTotaleOrdini(ordine.getValoreOrdine(),ordine.getQuantitaOrdine())){
              ejb.update(f);
              System.out.println("Fornitore "+id+" aggiornato");
          }else{
              System.out.println("Fornitore "+id+" non aggiornato");
          }
        
        } catch (JMSException ex) {
            Logger.getLogger(FornitoreMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      


    }
    
    
}
