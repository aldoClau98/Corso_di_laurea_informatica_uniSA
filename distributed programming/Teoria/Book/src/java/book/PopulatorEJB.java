/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

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
      databaseName="EsamePU",
      properties=("connectionAttributes=;create=true"))
public class PopulatorEJB {
    Book b1,b2,b3;
    @Inject
    private BookEJB bookejb;
    
    public PopulatorEJB(){
     
    }
     
    @PostConstruct
    private void populateDB(){

            
       b1 = new Book("1","titolo","autore",4);
        b2 = new Book("2","titolo","autore",12);
        b3 = new Book("3","titolo","autore",7);
        bookejb.addBook(b1);
        bookejb.addBook(b2);
        bookejb.addBook(b3);
    }
    @PreDestroy
    private void clearDB(){
        bookejb.removeBook(b1);
        bookejb.removeBook(b2);
        bookejb.removeBook(b3);
    }
    
    
}
