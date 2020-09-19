/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

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
    private LibroEJB libroejb;
    private  Libro  libro1, libro2,libro3;
    @PostConstruct
    private void populateDB(){//create and add books
        
        libro1= new Libro("1","titolo","autore",333 );
        libro2 =  new Libro("2","titolo","autore",333);
        libro3 =  new Libro("3","titolo","autore",333);
        libroejb.doCreate(libro1);
        libroejb.doCreate(libro3);
        libroejb.doCreate(libro2);
        
    }
    
    @PreDestroy
    private void clearDB() {//deletes all  the books
        
        libroejb.doDelete(libro1);
        libroejb.doDelete(libro2);
        libroejb.doDelete(libro3);
        
    }
    
}
