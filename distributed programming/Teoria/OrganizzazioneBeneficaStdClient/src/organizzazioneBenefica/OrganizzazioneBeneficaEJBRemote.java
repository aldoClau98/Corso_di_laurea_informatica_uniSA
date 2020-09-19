package organizzazioneBenefica;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface OrganizzazioneBeneficaEJBRemote {
    void aggiungiOrganizzazione(OrganizzazioneBenefica o);
    void aggiornaOrganizzazione(OrganizzazioneBenefica o);
    void eliminaOrganizzazione(OrganizzazioneBenefica o);
    
    List<OrganizzazioneBenefica> trovaTutteOrganizzazioni();
    List<OrganizzazioneBenefica> trovaPerProgetti(int numeroProgetti);
    OrganizzazioneBenefica trovaPerId(long id);
    List<OrganizzazioneBenefica> trovaPerBilancio();
    List<OrganizzazioneBenefica> trovaPerTrasparenza();
}
