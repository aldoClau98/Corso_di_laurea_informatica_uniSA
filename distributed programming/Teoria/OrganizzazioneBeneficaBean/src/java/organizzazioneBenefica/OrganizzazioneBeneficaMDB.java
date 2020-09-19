package organizzazioneBenefica;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;


@MessageDriven(mappedName = "jms/javaee7/Topic", 
    activationConfig = {
        @ActivationConfigProperty(propertyName="acknowledgeMode",
                propertyValue = "Auto-acknowledge")
})
public class OrganizzazioneBeneficaMDB implements MessageListener{
    @Inject 
    Event<OrganizzazioneBenefica> event;
    
    @Inject
    private OrganizzazioneBeneficaEJB ejb;

    @Override
    public void onMessage(Message msg) {
        try {
            Long id = msg.getLongProperty("id");
            Integer numeroDonatori = msg.getBody(Integer.class);
            OrganizzazioneBenefica o = ejb.trovaPerId(id);
            o.setNumeroDonatori(o.getNumeroDonatori() + numeroDonatori);
            ejb.aggiornaOrganizzazione(o);
            event.fire(o);
        } catch (JMSException ex) {
            Logger.getLogger(OrganizzazioneBeneficaMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
