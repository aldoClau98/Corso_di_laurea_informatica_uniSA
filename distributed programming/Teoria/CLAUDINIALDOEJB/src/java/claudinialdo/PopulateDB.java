/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claudinialdo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author ALDO
 */
//modificati i parametri della DatasourceDefinition
@Singleton
@Startup
@DataSourceDefinition(
   className = "org.apache.derby.jdbc.EmbeddedDataSource",
   name="java:global/jdbc/EsameDS",
   user = "app", password = "app",
   databaseName = "EsameDS",
   properties = {"connectionAttributes=;create=true"}
)
public class PopulateDB {
   
    //reso l' ejb e gli oggetti vino  private.
    @Inject
   private VinoEJB ejb;

   private Vino a1 = new Vino(1, "aglianico", "rosso", "italiano", (float) 10.5, 1000);
   private Vino a2 = new Vino(2, "falanghina", "bianco", "estero", 11, 500);
   private Vino  a3 = new Vino(3, "buono", "rosato", "italiano", 13, 2000);
    
 
    @PostConstruct
    public void populate(){
        ejb.add(a1);
        ejb.add(a2);
        ejb.add(a3);
    }

    @PreDestroy
    public void clean(){
        ejb.remove(a1);
        ejb.remove(a2);
        ejb.remove(a3);
    }
    
}
