package organizzazionebeneficawebclient;

import java.util.List;
import organizzazionebenefica.*;

public class OrganizzazioneBeneficaWebClient {

    public static void main(String[] args) {
        List<OrganizzazioneBenefica> results = trovaPerTrasparenza();
        for(OrganizzazioneBenefica o : results)
            System.out.println(o.getNome());
        
    }
//metodo ch recupera la trasparenza 
    private static java.util.List<organizzazionebenefica.OrganizzazioneBenefica> trovaPerTrasparenza() {
        organizzazionebenefica.OrganizzazioneBeneficaEJBService service = 
                new organizzazionebenefica.OrganizzazioneBeneficaEJBService();
        organizzazionebenefica.OrganizzazioneBeneficaEJB port = service.getOrganizzazioneBeneficaEJBPort();
        return port.trovaPerTrasparenza();
    }
    
}
