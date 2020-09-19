
package fornitoribean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per fornitore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="fornitore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxOrdine" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeSocieta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totaleOrdini" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="valoreTotaleOrdini" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fornitore", propOrder = {
    "cognome",
    "id",
    "maxOrdine",
    "nome",
    "nomeSocieta",
    "telefono",
    "totaleOrdini",
    "valoreTotaleOrdini"
})
public class Fornitore {

    protected String cognome;
    protected String id;
    protected int maxOrdine;
    protected String nome;
    protected String nomeSocieta;
    protected String telefono;
    protected int totaleOrdini;
    protected int valoreTotaleOrdini;

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà id.
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
     * Imposta il valore della proprietà id.
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
     * Recupera il valore della proprietà maxOrdine.
     * 
     */
    public int getMaxOrdine() {
        return maxOrdine;
    }

    /**
     * Imposta il valore della proprietà maxOrdine.
     * 
     */
    public void setMaxOrdine(int value) {
        this.maxOrdine = value;
    }

    /**
     * Recupera il valore della proprietà nome.
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
     * Imposta il valore della proprietà nome.
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
     * Recupera il valore della proprietà nomeSocieta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSocieta() {
        return nomeSocieta;
    }

    /**
     * Imposta il valore della proprietà nomeSocieta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSocieta(String value) {
        this.nomeSocieta = value;
    }

    /**
     * Recupera il valore della proprietà telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Imposta il valore della proprietà telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Recupera il valore della proprietà totaleOrdini.
     * 
     */
    public int getTotaleOrdini() {
        return totaleOrdini;
    }

    /**
     * Imposta il valore della proprietà totaleOrdini.
     * 
     */
    public void setTotaleOrdini(int value) {
        this.totaleOrdini = value;
    }

    /**
     * Recupera il valore della proprietà valoreTotaleOrdini.
     * 
     */
    public int getValoreTotaleOrdini() {
        return valoreTotaleOrdini;
    }

    /**
     * Imposta il valore della proprietà valoreTotaleOrdini.
     * 
     */
    public void setValoreTotaleOrdini(int value) {
        this.valoreTotaleOrdini = value;
    }

}
