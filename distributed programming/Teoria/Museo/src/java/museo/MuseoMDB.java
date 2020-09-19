/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
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
@MessageDriven(mappedName="jms/javaee7/Topic"
        ,activationConfig = {
    @ActivationConfigProperty(propertyName = "clientId", propertyValue = "jms/javaee7/Topic"),
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/javaee7/Topic"),
    @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "Durable"),
    @ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "jms/javaee7/Topic"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
public class MuseoMDB implements MessageListener {
    
    public MuseoMDB() {
    }
    @Inject
    MuseoEJB ejbm;
    @Override
    public void onMessage(Message message) {
        try {
         
           Museo temp =  ejbm.findId(message.getBody(Museo.class).getId());
           ejbm.update(temp);
           event.fire(temp);
           
        } catch (JMSException ex) {
            Logger.getLogger(MuseoMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Inject
    private Event<Museo> event;
    
}
