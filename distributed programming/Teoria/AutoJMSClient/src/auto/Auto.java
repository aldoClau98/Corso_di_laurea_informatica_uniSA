package auto;



import static auto.Auto.FINDCATEGORIA;
import static auto.Auto.FINDID;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;
import static auto.Auto.FINDALL;
import static auto.Auto.ORDINE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALDO
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name=FINDALL, query =" select a from Auto a"),
    @NamedQuery(name=FINDID,query="select a from Auto a where a.id=?1"),
    @NamedQuery(name=FINDCATEGORIA, query = "select a from Auto a where  a.categoria=?1"),
    @NamedQuery(name=ORDINE, query = "select a from Auto  a where a.disponibilita<?1")
})
public class Auto implements Serializable{

    public static final  String FINDALL = "Auto.FINDALL";
    public static final String FINDID = "Auto.FINDID";
    public static final String FINDCATEGORIA = "Auto.FINDCATEGORIA";
    public static final String ORDINE = "Auto.ORDINE";

    @Id
    public String id;
    public String nome, categoria;
    public int prezzo, disponibilita, vendite;

    public  Auto(){
        
    }

    public Auto(String id, String nome, String categoria, int prezzo, int disponibilita, int vendite) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.prezzo = prezzo;
        this.disponibilita = disponibilita;
        this.vendite = vendite;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(int disponibilita) {
        this.disponibilita = disponibilita;
    }

    public int getVendite() {
        return vendite;
    }

    public void setVendite(int vendite) {
        this.vendite = vendite;
    }
    
    
    
}
