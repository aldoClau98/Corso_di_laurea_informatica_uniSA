/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;


import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;



/**
 *
 * @author ALDO
 */

@MessageDriven(mappedName="jms/javaee7/Topic")
public class AutoMDB implements MessageListener{
 
    @Inject 
    Event<Auto> event;

  public  void onMessage(Message message){
      Auto a = message.getbody(Auto.class)
              event.fire();
  }
    
}
