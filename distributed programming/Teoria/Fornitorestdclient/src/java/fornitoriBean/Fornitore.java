/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitoriBean;


import static fornitoriBean.Fornitore.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author ALDO
 */
@Entity
@NamedQueries({
    @NamedQuery(name=FIND_ALL, query="select f from Fornitore f "),
@NamedQuery(name=FIND_ID, query="select f from Fornitore f where  f.id =?1"),
@NamedQuery(name=FIND_COGNOME, query="SELECT f FROM Fornitore WHERE f.cognome =: cognome"),
@NamedQuery(name=FIND_MAXORDINE, query="SELECT f FROM Fornitore WHERE f.maxOrdine >: max")
})
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
    private Integer maxOrdine;
    private Integer valoreTotaleOrdini;
    private Integer totaleOrdini;
    
    
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

    public Integer getMaxOrdine() {
        return maxOrdine;
    }

    public void setMaxOrdine(Integer maxOrdine) {
        this.maxOrdine = maxOrdine;
    }

    public Integer getValoreTotaleOrdini() {
        return valoreTotaleOrdini;
    }

    public void setValoreTotaleOrdini(Integer valoreTotaleOrdini) {
        this.valoreTotaleOrdini = valoreTotaleOrdini;
    }

    public Integer getTotaleOrdini() {
        return totaleOrdini;
    }

    public void setTotaleOrdini(Integer totaleOrdini) {
        this.totaleOrdini = totaleOrdini;
    }
  
    
    
}
