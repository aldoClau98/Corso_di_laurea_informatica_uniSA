/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autostdclient;


import auto.Auto;
import auto.AutoEJBRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author ALDO
 */
public class AutoStdClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        
        AutoEJBRemote ejb;
        ejb = (AutoEJBRemote) ctx.lookup("java:global/Auto/autoEJB!auto.AutoEJBRemote");
        Auto a1;
        a1 = new  Auto("1","SensoreTemperatura", "Motore", 18, 100, 2000);
       Auto  temp= ejb.update(a1);
        if(temp != null){
            System.out.println("Pezzo: "+a1.getNome()+" aggiornato, Vendite: "+a1.getVendite());
        }
    }
    
}
