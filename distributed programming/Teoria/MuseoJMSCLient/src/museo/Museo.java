/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import static museo.Museo.FIND_ALL;
import static museo.Museo.FIND_ID;
import static museo.Museo.FIND_REG;

/**
 *
 * @author ALDO
 */
@Entity
@NamedQueries({
    @NamedQuery(name=FIND_ID, query="SELECT m FROM Museo m WHERE m.id=?1"),
@NamedQuery(name=FIND_REG, query="SELECT m FROM Museo m WHERE m.regione=?1"),
@NamedQuery(name=FIND_ALL, query="SELECT m FROM Museo m")
})
public class Museo implements Serializable {
    public final static String FIND_ID ="museo.find_id";
      public final static String FIND_REG ="museo.find_regione";
        public final static String FIND_ALL ="museo.find_all";
    @Id
    public String id;
    private String nome,direttore,citta, provincia, regione;
    private int numVis, anno;

    public Museo() {
    }

    public Museo(String id, String nome, String direttore, String citta, String provincia, String regione, int numVis, int anno) {
        this.id = id;
        this.nome = nome;
        this.direttore = direttore;
        this.citta = citta;
        this.provincia = provincia;
        this.regione = regione;
        this.numVis = numVis;
        this.anno = anno;
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

    public String getDirettore() {
        return direttore;
    }

    public void setDirettore(String direttore) {
        this.direttore = direttore;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public int getNumVis() {
        return numVis;
    }

    public void setNumVis(int numVis) {
        this.numVis = numVis;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Museo{" + "id=" + id + ", nome=" + nome + ", direttore=" + direttore + ", citta=" + citta + ", provincia=" + provincia + ", regione=" + regione + ", numVis=" + numVis + ", anno=" + anno + '}';
    }
    
    
}
