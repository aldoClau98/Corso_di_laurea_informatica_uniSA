/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claudinialdo;

import javax.enterprise.event.Observes;

/**
 *
 * @author ALDO
 */
public class VinoEvento {
    
    public void notify(@Observes Vino v){
        System.out.println("Bottiglie "+v.getNome()+" aggiornato!");
    }
    
}
