package organizzazioneBenefica;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
@DataSourceDefinition(
   className = "org.apache.derby.jdbc.ClientDriver",
   name = "",
   user = "app", password = "app",
   databaseName = "EsercizioDS",
   properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    
    @Inject
    private OrganizzazioneBeneficaEJB ejb;
    private OrganizzazioneBenefica o1, o2, o3, o4;
    
    @PostConstruct
    private void populateDB(){
        o1 = new OrganizzazioneBenefica("Save the Children Italia", "Roma", 291, 53, 408830, 113169865.00F, 50);
        o2 = new OrganizzazioneBenefica("Medici senza frontiera", "Roma", 50, 48, 286004, 61403682.00F, 50);
        o3 = new OrganizzazioneBenefica("ActionAid", "Milano", 220, 33, 131920, 68097472.00F, 100);
        o4 = new OrganizzazioneBenefica("Emergency", "Milano", 50, 7, 66311, 41842957.00F, 100);
        
        ejb.aggiungiOrganizzazione(o1);
        ejb.aggiungiOrganizzazione(o2);
        ejb.aggiungiOrganizzazione(o3);
        ejb.aggiungiOrganizzazione(o4);
    }
    
    @PreDestroy
    private void clearDB(){
        ejb.eliminaOrganizzazione(o1);
        ejb.eliminaOrganizzazione(o2);
        ejb.eliminaOrganizzazione(o3);
        ejb.eliminaOrganizzazione(o4);
    }
    
    
}
