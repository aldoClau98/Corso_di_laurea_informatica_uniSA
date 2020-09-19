/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museostdclient;

import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import museo.MuseoEJBRemote;

/**
 *
 * @author ALDO
 */
public class MuseoStdClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException{
       
        Context  ctx =  new  InitialContext();
        MuseoEJBRemote ejbm = (MuseoEJBRemote) ctx.lookup("java:global/Museo/MuseoEJB!museo.MuseoEJBRemote");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci  una regione : ");
        String reg = in.next();
        ejbm.findReg(reg);
        
   
        
    }
    
    
  
    
}
