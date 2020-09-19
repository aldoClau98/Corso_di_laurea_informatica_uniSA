/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import javax.enterprise.event.Observes;

/**
 *
 * @author ALDO
 */
public class Museonotifiche {
    
    
    
    public void notify(@Observes Museo m){
        System.out.println(" E cambiato: "+m.toString());
    }
}
