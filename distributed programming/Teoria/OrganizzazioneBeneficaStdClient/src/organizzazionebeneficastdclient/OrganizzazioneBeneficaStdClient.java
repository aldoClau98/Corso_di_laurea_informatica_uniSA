package organizzazionebeneficastdclient;

import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import organizzazioneBenefica.*;

public class OrganizzazioneBeneficaStdClient {

    private static OrganizzazioneBeneficaEJBRemote organizzazioneEjb;

    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        //mapellegrino@unisa.it
        organizzazioneEjb = (OrganizzazioneBeneficaEJBRemote) 
  ctx.lookup("java:global/Fornitore/DatabasePopulator!fornitoriBean.DatabasePopulator");
        
        List<OrganizzazioneBenefica> list = organizzazioneEjb.trovaTutteOrganizzazioni();
        System.out.println("Tutte le organizzazioni:");
        for(OrganizzazioneBenefica o : list){
            System.out.println(o);
        }
        
        System.out.println("Tutte le organizzazioni con bilancio 50000000:");
        list = organizzazioneEjb.trovaPerBilancio();
        for(OrganizzazioneBenefica o : list){
            System.out.println(o);
        }
    }
    
}
