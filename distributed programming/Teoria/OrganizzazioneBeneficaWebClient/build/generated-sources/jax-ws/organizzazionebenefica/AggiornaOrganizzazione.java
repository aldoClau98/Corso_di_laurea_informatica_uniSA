
package organizzazionebenefica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per aggiornaOrganizzazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="aggiornaOrganizzazione"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://organizzazioneBenefica/}organizzazioneBenefica" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aggiornaOrganizzazione", propOrder = {
    "arg0"
})
public class AggiornaOrganizzazione {

    protected OrganizzazioneBenefica arg0;

    /**
     * Recupera il valore della proprietÓ arg0.
     * 
     * @return
     *     possible object is
     *     {@link OrganizzazioneBenefica }
     *     
     */
    public OrganizzazioneBenefica getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietÓ arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizzazioneBenefica }
     *     
     */
    public void setArg0(OrganizzazioneBenefica value) {
        this.arg0 = value;
    }

}
