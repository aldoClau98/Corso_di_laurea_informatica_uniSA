/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claudinialdoclient;

import java.util.List;
import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import claudinialdo.Vino;
import claudinialdo.VinoEJBRemote;
import javax.naming.NameClassPair;

/**
 *
 * @author ALDO
 */
public class CLAUDINIALDOCLIENT  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        
          List<Vino> lista;  
           //modificata la stringa di lookup
          int numerobottiglie;
          String produzione;
          Context ctx = new  InitialContext();
          VinoEJBRemote ejb = (VinoEJBRemote) ctx.lookup("java:global/CLAUDINIALDOEJB/VinoEJB!claudinialdo.VinoEJBRemote");
          Scanner in = new Scanner(System.in);
          
         //aggiunto stringhe da stampare a video
          System.out.print("Inserisci una produzione(italiano o estero): ");
          produzione = in.next();
         
          lista = ejb.trovaProduzione(produzione);

               for(Vino o : lista){
               System.out.println("Vino: "+o.getNome());
               }
                 
          System.out.print("Inserisci il numero minimo di bottiglie prodotte da cercare: ");

          numerobottiglie = in.nextInt();
          System.out.println("Vini con piu di "+numerobottiglie+" bottiglie prodotte");
          lista = ejb.cercaBottiglie(numerobottiglie);

        for(Vino o: lista){
             System.out.println("Vini: "+o.getNome());
            }
    
    }
}