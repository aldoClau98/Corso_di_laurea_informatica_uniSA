
package museo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per museo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="museo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="citta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direttore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numVis" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "museo", propOrder = {
    "anno",
    "citta",
    "direttore",
    "id",
    "nome",
    "numVis",
    "provincia",
    "regione"
})
public class Museo {

    protected int anno;
    protected String citta;
    protected String direttore;
    protected String id;
    protected String nome;
    protected int numVis;
    protected String provincia;
    protected String regione;

    /**
     * Recupera il valore della propriet� anno.
     * 
     */
    public int getAnno() {
        return anno;
    }

    /**
     * Imposta il valore della propriet� anno.
     * 
     */
    public void setAnno(int value) {
        this.anno = value;
    }

    /**
     * Recupera il valore della propriet� citta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitta() {
        return citta;
    }

    /**
     * Imposta il valore della propriet� citta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitta(String value) {
        this.citta = value;
    }

    /**
     * Recupera il valore della propriet� direttore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirettore() {
        return direttore;
    }

    /**
     * Imposta il valore della propriet� direttore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirettore(String value) {
        this.direttore = value;
    }

    /**
     * Recupera il valore della propriet� id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della propriet� id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della propriet� nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della propriet� nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della propriet� numVis.
     * 
     */
    public int getNumVis() {
        return numVis;
    }

    /**
     * Imposta il valore della propriet� numVis.
     * 
     */
    public void setNumVis(int value) {
        this.numVis = value;
    }

    /**
     * Recupera il valore della propriet� provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Imposta il valore della propriet� provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della propriet� regione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegione() {
        return regione;
    }

    /**
     * Imposta il valore della propriet� regione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegione(String value) {
        this.regione = value;
    }

}
