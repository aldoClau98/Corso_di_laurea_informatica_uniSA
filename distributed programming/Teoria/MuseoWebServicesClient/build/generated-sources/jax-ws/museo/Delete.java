
package museo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per delete complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="delete"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://museo/}museo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delete", propOrder = {
    "arg0"
})
public class Delete {

    protected Museo arg0;

    /**
     * Recupera il valore della proprietÓ arg0.
     * 
     * @return
     *     possible object is
     *     {@link Museo }
     *     
     */
    public Museo getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietÓ arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Museo }
     *     
     */
    public void setArg0(Museo value) {
        this.arg0 = value;
    }

}
