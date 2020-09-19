/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author ALDO
 */

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
 @NamedQueries({
    @NamedQuery(name=Libro.FINDALL, query="select  b from Libro b"),
    @NamedQuery(name=Libro.FINDBYID, query ="Select b from  Libro b where  b.id=?1")
})
public class Libro implements  Serializable{
    protected static final  String FINDALL ="Libro.findAll";
    protected static final String FINDBYID="Libro.findById";
   private static final long serialVersionUID = 1L;
    @Id 
    private String id;
    private String titolo;
    private String autore;
    private Integer  prezzo;
    
    
    public Libro(){};

    public Libro(String id,String titolo,String autore, Integer prezzo){
        this.autore=autore;
        this.id=id;
        this.titolo=titolo;
        this.prezzo=prezzo;
    }

    public String getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public double getPrezzo() {
        return prezzo;
    }
    
}