/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitoriBean;

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
@Singleton
@Startup
@DataSourceDefinition(
    className="org.apache.derby.jdbc.EmbeddedDataSource",
         name="java:global/jdbc/EsameDS",
         user="app",
      password="app",
      databaseName="EsercizioDB",
      properties=("connectionAttributes=;create=true")
    
)
public class DatabasePopulator {
    @Inject
   private  FornitoreEJB fornitoreEJB;
   private  Fornitore r1,r2,r3;
 
       
    @PostConstruct
    public void populateDB(){
          r1 = new Fornitore("1", "aldo", "claudini", "fosociety", "098765432", 10, 1000, 7);
        r2 = new Fornitore("2", "emilio", "schiavo", "status418", "098765432", 7, 2000, 14);
        r3 = new Fornitore("3", "ale", "falcone", "dell", "098765432", 3, 500, 3);
   
        fornitoreEJB.create(r1);
        fornitoreEJB.create(r2);
        fornitoreEJB.create(r3);
        
    }
    
    @PreDestroy
    public void  deleteDB(){
        
        fornitoreEJB.delete(r1);
        fornitoreEJB.delete(r2);
        fornitoreEJB.delete(r3);
        
    }
    
    
    
}
