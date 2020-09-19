
package organizzazionebenefica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per organizzazioneBenefica complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="organizzazioneBenefica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bilancio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroDonatori" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numeroPaesiCoperti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="percentualeTrasparenza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="progetti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizzazioneBenefica", propOrder = {
    "bilancio",
    "id",
    "nome",
    "numeroDonatori",
    "numeroPaesiCoperti",
    "percentualeTrasparenza",
    "progetti",
    "sede"
})
public class OrganizzazioneBenefica {

    protected Float bilancio;
    protected Long id;
    protected String nome;
    protected Integer numeroDonatori;
    protected Integer numeroPaesiCoperti;
    protected Integer percentualeTrasparenza;
    protected Integer progetti;
    protected String sede;

    /**
     * Recupera il valore della proprietà bilancio.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBilancio() {
        return bilancio;
    }

    /**
     * Imposta il valore della proprietà bilancio.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBilancio(Float value) {
        this.bilancio = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Recupera il valore della proprietà numeroDonatori.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroDonatori() {
        return numeroDonatori;
    }

    /**
     * Imposta il valore della proprietà numeroDonatori.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroDonatori(Integer value) {
        this.numeroDonatori = value;
    }

    /**
     * Recupera il valore della proprietà numeroPaesiCoperti.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroPaesiCoperti() {
        return numeroPaesiCoperti;
    }

    /**
     * Imposta il valore della proprietà numeroPaesiCoperti.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroPaesiCoperti(Integer value) {
        this.numeroPaesiCoperti = value;
    }

    /**
     * Recupera il valore della proprietà percentualeTrasparenza.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentualeTrasparenza() {
        return percentualeTrasparenza;
    }

    /**
     * Imposta il valore della proprietà percentualeTrasparenza.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentualeTrasparenza(Integer value) {
        this.percentualeTrasparenza = value;
    }

    /**
     * Recupera il valore della proprietà progetti.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgetti() {
        return progetti;
    }

    /**
     * Imposta il valore della proprietà progetti.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgetti(Integer value) {
        this.progetti = value;
    }

    /**
     * Recupera il valore della proprietà sede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSede() {
        return sede;
    }

    /**
     * Imposta il valore della proprietà sede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSede(String value) {
        this.sede = value;
    }

}
