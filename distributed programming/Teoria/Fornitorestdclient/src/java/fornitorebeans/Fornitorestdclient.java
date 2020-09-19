/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitorebeans;

import fornitoriBean.Fornitore;
import fornitoriBean.FornitoreEJBRemote;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;

import javax.naming.NamingException;

/**
 *
 * @author ALDO
 */
public class Fornitorestdclient {

    
    /**
     * @param args the command line arguments
     * @throws javax.naming.NamingException
     */
    public static void main(String[] args) throws NamingException {
        
    Context ctx =new InitialContext();
    FornitoreEJBRemote    fornitoreEJB = (FornitoreEJBRemote) ctx.lookup("java:global/Fornitore/FornitoreEJB!fornitoriBean.FornitoreEJBRemote");
    List<Fornitore> lista =  fornitoreEJB.findAll();
    
    
    for(Fornitore  o : lista){
            System.out.println(o.getId());
        }
        
        System.out.println("Tutte i fornitori con ordini maggiori di  1000 :");
       
        lista =  fornitoreEJB.findMax(1000);
        
           for(Fornitore  o : lista){
            System.out.println(o.getMaxOrdine());
        }
    
    
    }
    
}
