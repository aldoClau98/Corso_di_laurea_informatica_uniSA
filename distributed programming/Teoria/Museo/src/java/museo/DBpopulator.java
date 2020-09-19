/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

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
      databaseName="EsameDB",
      properties=("connectionAttributes=;create=true"))
public class DBpopulator {
      public Museo m1, m2, m3;
       

    public DBpopulator() {
    }
   
    @Inject
    MuseoEJB museoejb;
    
    
    
    @PostConstruct
    public void populateDB(){
    
    m1 = new Museo("1", "museo1", "aldo", "napoli", "NA", "Campania", 100, 1998);
    m2 = new Museo("2", "museo2", "giovann", "Milano", "MI", "Lombardia", 150, 2007);
    m3 = new Museo("3", "museo2", "giacomo", "palermo", "PA", "Sicilia", 300, 2003);
    
    museoejb.create(m1);
    museoejb.create(m2);
    museoejb.create(m3);
}
    
    @PreDestroy
    public void deleteDB(){
        museoejb.delete(m1);
        museoejb.delete(m2);
        museoejb.delete(m3);
    }
    
}
