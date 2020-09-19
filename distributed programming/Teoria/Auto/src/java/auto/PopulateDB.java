/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

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
@Startup
@Singleton
@DataSourceDefinition(
    className="org.apache.derby.jdbc.EmbeddedDataSource",
         name="java:global/jdbc/EsameDS",
         user="app",
      password="app",
      databaseName="EsamePU",
      properties=("connectionAttributes=;create=true")
)
public class PopulateDB {
    
    Auto a1,a2,a3;
    
    @Inject
    AutoEJB ejb;
    public PopulateDB(){
        
    }
   
    @PostConstruct
    public void populate(){
     a1 = new Auto("1", "SensoreTemperatura", "Motore", 18, 100, 1000);
     a2 = new Auto("2", "FAP", "Filtri", 188, 9, 1);
     a3 = new Auto("3", "DischiFreni", "Freni", 18, 2000, 5000);
    
        ejb.add(a1);
        ejb.add(a2);
        ejb.add(a3);
        
    }
    
    @PreDestroy
    public void clear(){
        ejb.remove(a1);
        ejb.remove(a2);
        ejb.remove(a3);
              
    }
}
