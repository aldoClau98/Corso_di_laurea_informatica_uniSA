/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitoriBean;

import static fornitoriBean.Fornitore.FIND_ALL;
import static fornitoriBean.Fornitore.FIND_COGNOME;
import static fornitoriBean.Fornitore.FIND_ID;
import static fornitoriBean.Fornitore.FIND_MAXORDINE;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALDO
 */




@Entity
@NamedQueries({
    @NamedQuery(name=FIND_ALL, query="select f from Fornitore f "),
@NamedQuery(name=FIND_ID, query="select f from Fornitore f where  f.id =?1"),
@NamedQuery(name=FIND_COGNOME, query="SELECT f FROM Fornitore f WHERE f.cognome =?1"),
@NamedQuery(name=FIND_MAXORDINE, query="SELECT f FROM Fornitore f WHERE f.maxOrdine >?1")
})
@XmlRootElement
public class Fornitore implements Serializable{
  public static final  String  FIND_ALL = "Fornitore.FIND_ALL";
     public static final  String FIND_ID = "Fornitore.FIND_ID";
              public static final  String FIND_COGNOME = "Fornitore.FIND_COGNOME";
                       public static final  String FIND_MAXORDINE = "Fornitore.FIND_MAXORDINE";
  
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;
    private String nome;
    private String cognome;
    private String nomeSocieta;
    private String telefono;
    private int maxOrdine;
    private int valoreTotaleOrdini;
    private int totaleOrdini;
    
    
    public Fornitore() {
        
    }

    public Fornitore(String id, String nome, String cognome, String nomeSocieta, String telefono, Integer maxOrdine, Integer valoreTotaleOrdini, Integer totaleOrdini) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.nomeSocieta = nomeSocieta;
        this.telefono = telefono;
        this.maxOrdine = maxOrdine;
        this.valoreTotaleOrdini = valoreTotaleOrdini;
        this.totaleOrdini = totaleOrdini;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNomeSocieta() {
        return nomeSocieta;
    }

    public void setNomeSocieta(String nomeSocieta) {
        this.nomeSocieta = nomeSocieta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getMaxOrdine() {
        return maxOrdine;
    }

    public void setMaxOrdine(int maxOrdine) {
        this.maxOrdine = maxOrdine;
    }

    public int getValoreTotaleOrdini() {
        return valoreTotaleOrdini;
    }

    public void setValoreTotaleOrdini(int valoreTotaleOrdini) {
        this.valoreTotaleOrdini = valoreTotaleOrdini;
    }

    public int getTotaleOrdini() {
        return totaleOrdini;
    }

    public void setTotaleOrdini(int totaleOrdini) {
        this.totaleOrdini = totaleOrdini;
    }
private boolean controllaQuantitaOrdine(int quantitaOrdiniAggiuntiva){
    return(this.totaleOrdini+quantitaOrdiniAggiuntiva<=this.maxOrdine);
}
    boolean incrementaTotaleOrdini(int valoreOrdine, int quantitaOrdine) {

if(controllaQuantitaOrdine(quantitaOrdine)){
    setValoreTotaleOrdini(getValoreTotaleOrdini()+ valoreOrdine);
    setTotaleOrdini(getTotaleOrdini() +quantitaOrdine);
    return true;
}else
    return false;



    }

   
  
    
    
}
