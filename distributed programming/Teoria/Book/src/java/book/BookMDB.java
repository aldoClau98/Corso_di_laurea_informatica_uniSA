/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

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
@MessageDriven(mappedName="jms/javaee7/Topic")
public class BookMDB implements MessageListener {
    
    @Inject
    private BookEJB bookejb;

    @Override
    public void onMessage(Message message) { 
    try{
        Book b = message.getBody(Book.class);
        System.out.println("Update Avvenuto!"+ bookejb.updateBook(b).toString());
    }   catch (JMSException ex) {
            Logger.getLogger(BookMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
