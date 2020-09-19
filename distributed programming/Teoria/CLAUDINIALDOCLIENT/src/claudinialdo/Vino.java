/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claudinialdo;


import static claudinialdo.Vino.CERCABOTTIGLIE;
import static claudinialdo.Vino.TIPODIVINO;
import static claudinialdo.Vino.TROVAID;
import static claudinialdo.Vino.TROVAPERPRODUZIONE;
import static claudinialdo.Vino.TROVATUTTI;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author ALDO
 */
//query da fare al  database 

@Entity
@NamedQueries({
    @NamedQuery(name=TROVATUTTI, query="SELECT v FROM Vino v"),
    @NamedQuery(name=TROVAID, query="SELECT v FROM Vino v WHERE v.id=?1"),
    @NamedQuery(name=TIPODIVINO, query = "SELECT v FROM Vino v WHERE v.tipovino=?1"),
    @NamedQuery(name=TROVAPERPRODUZIONE, query ="SELECT v FROM Vino v WHERE v.produzione=?1"),
    //cambiato il simbolo da < a >
    @NamedQuery(name=CERCABOTTIGLIE, query="SELECT v FROM Vino  v WHERE v.bottiglie>?1")
})
public class Vino implements Serializable {
    
    @Id
    public int id;
    public String nome;
    public String tipovino;
    public String produzione;
    public float gradi;
    public int bottiglie;
 
   //aggiunta la costante serialVersionUID

public static final String  TROVATUTTI = "claudinialdo.TROVATUTTI";
public static final String  TROVAID = "claudinialdo.TROVAID";
public static final String  TIPODIVINO = "claudinialdo.TIPODIVINO";
public static final String  TROVAPERPRODUZIONE = "claudinialdo.TROVAPERPRODUZIONE";
public static final String  CERCABOTTIGLIE = "claudinialdo.CERCABOTTIGLIE";

    
    public Vino() {
    }

    public Vino(int id, String nome, String tipovino, String produzione, float gradi, int bottiglie) {
        this.id = id;
        this.nome = nome;
        this.tipovino = tipovino;
        this.produzione = produzione;
        this.gradi = gradi;
        this.bottiglie = bottiglie;
    }

    
   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipovino() {
        return tipovino;
    }

    public void setTipovino(String tipovino) {
        this.tipovino = tipovino;
    }

    public String getProduzione() {
        return produzione;
    }

    public void setProduzione(String produzione) {
        this.produzione = produzione;
    }

    public float getGradi() {
        return gradi;
    }

    public void setGradi(float gradi) {
        this.gradi = gradi;
    }

    public int getBottiglie() {
        return bottiglie;
    }

    public void setBottiglie(int bottiglie) {
        this.bottiglie = bottiglie;
    }

}
