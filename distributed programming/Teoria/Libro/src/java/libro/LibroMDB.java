/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author ALDO
 */

@MessageDriven(mappedName="jms/javaee7/Topic")


public class LibroMDB implements MessageListener {
    
    @Inject
    private LibroEJB libroejb;
    
    @Override
    public void onMessage(Message msg){
        try{
            Libro b = msg.getBody(Libro.class);
            libroejb.doUpdate(b);
            System.out.println(b.getAutore());
            
        }catch(JMSException ex){
        } 
    }
    
}
