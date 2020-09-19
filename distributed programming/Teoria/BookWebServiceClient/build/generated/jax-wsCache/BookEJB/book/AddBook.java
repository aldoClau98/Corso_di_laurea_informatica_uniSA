
package book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addBook complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addBook"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://book/}book" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBook", propOrder = {
    "arg0"
})
public class AddBook {

    protected Book arg0;

    /**
     * Recupera il valore della propriet? arg0.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della propriet? arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setArg0(Book value) {
        this.arg0 = value;
    }

}
