
package organizzazionebenefica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the organizzazionebenefica package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AggiornaOrganizzazione_QNAME = new QName("http://organizzazioneBenefica/", "aggiornaOrganizzazione");
    private final static QName _AggiornaOrganizzazioneResponse_QNAME = new QName("http://organizzazioneBenefica/", "aggiornaOrganizzazioneResponse");
    private final static QName _AggiungiOrganizzazione_QNAME = new QName("http://organizzazioneBenefica/", "aggiungiOrganizzazione");
    private final static QName _AggiungiOrganizzazioneResponse_QNAME = new QName("http://organizzazioneBenefica/", "aggiungiOrganizzazioneResponse");
    private final static QName _EliminaOrganizzazione_QNAME = new QName("http://organizzazioneBenefica/", "eliminaOrganizzazione");
    private final static QName _EliminaOrganizzazioneResponse_QNAME = new QName("http://organizzazioneBenefica/", "eliminaOrganizzazioneResponse");
    private final static QName _OrganizzazioneBenefica_QNAME = new QName("http://organizzazioneBenefica/", "organizzazioneBenefica");
    private final static QName _TrovaPerBilancio_QNAME = new QName("http://organizzazioneBenefica/", "trovaPerBilancio");
    private final static QName _TrovaPerBilancioResponse_QNAME = new QName("http://organizzazioneBenefica/", "trovaPerBilancioResponse");
    private final static QName _TrovaPerId_QNAME = new QName("http://organizzazioneBenefica/", "trovaPerId");
    private final static QName _TrovaPerIdResponse_QNAME = new QName("http://organizzazioneBenefica/", "trovaPerIdResponse");
    private final static QName _TrovaPerProgetti_QNAME = new QName("http://organizzazioneBenefica/", "trovaPerProgetti");
    private final static QName _TrovaPerProgettiResponse_QNAME = new QName("http://organizzazioneBenefica/", "trovaPerProgettiResponse");
    private final static QName _TrovaPerTrasparenza_QNAME = new QName("http://organizzazioneBenefica/", "trovaPerTrasparenza");
    private final static QName _TrovaPerTrasparenzaResponse_QNAME = new QName("http://organizzazioneBenefica/", "trovaPerTrasparenzaResponse");
    private final static QName _TrovaTutteOrganizzazioni_QNAME = new QName("http://organizzazioneBenefica/", "trovaTutteOrganizzazioni");
    private final static QName _TrovaTutteOrganizzazioniResponse_QNAME = new QName("http://organizzazioneBenefica/", "trovaTutteOrganizzazioniResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: organizzazionebenefica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AggiornaOrganizzazione }
     * 
     */
    public AggiornaOrganizzazione createAggiornaOrganizzazione() {
        return new AggiornaOrganizzazione();
    }

    /**
     * Create an instance of {@link AggiornaOrganizzazioneResponse }
     * 
     */
    public AggiornaOrganizzazioneResponse createAggiornaOrganizzazioneResponse() {
        return new AggiornaOrganizzazioneResponse();
    }

    /**
     * Create an instance of {@link AggiungiOrganizzazione }
     * 
     */
    public AggiungiOrganizzazione createAggiungiOrganizzazione() {
        return new AggiungiOrganizzazione();
    }

    /**
     * Create an instance of {@link AggiungiOrganizzazioneResponse }
     * 
     */
    public AggiungiOrganizzazioneResponse createAggiungiOrganizzazioneResponse() {
        return new AggiungiOrganizzazioneResponse();
    }

    /**
     * Create an instance of {@link EliminaOrganizzazione }
     * 
     */
    public EliminaOrganizzazione createEliminaOrganizzazione() {
        return new EliminaOrganizzazione();
    }

    /**
     * Create an instance of {@link EliminaOrganizzazioneResponse }
     * 
     */
    public EliminaOrganizzazioneResponse createEliminaOrganizzazioneResponse() {
        return new EliminaOrganizzazioneResponse();
    }

    /**
     * Create an instance of {@link OrganizzazioneBenefica }
     * 
     */
    public OrganizzazioneBenefica createOrganizzazioneBenefica() {
        return new OrganizzazioneBenefica();
    }

    /**
     * Create an instance of {@link TrovaPerBilancio }
     * 
     */
    public TrovaPerBilancio createTrovaPerBilancio() {
        return new TrovaPerBilancio();
    }

    /**
     * Create an instance of {@link TrovaPerBilancioResponse }
     * 
     */
    public TrovaPerBilancioResponse createTrovaPerBilancioResponse() {
        return new TrovaPerBilancioResponse();
    }

    /**
     * Create an instance of {@link TrovaPerId }
     * 
     */
    public TrovaPerId createTrovaPerId() {
        return new TrovaPerId();
    }

    /**
     * Create an instance of {@link TrovaPerIdResponse }
     * 
     */
    public TrovaPerIdResponse createTrovaPerIdResponse() {
        return new TrovaPerIdResponse();
    }

    /**
     * Create an instance of {@link TrovaPerProgetti }
     * 
     */
    public TrovaPerProgetti createTrovaPerProgetti() {
        return new TrovaPerProgetti();
    }

    /**
     * Create an instance of {@link TrovaPerProgettiResponse }
     * 
     */
    public TrovaPerProgettiResponse createTrovaPerProgettiResponse() {
        return new TrovaPerProgettiResponse();
    }

    /**
     * Create an instance of {@link TrovaPerTrasparenza }
     * 
     */
    public TrovaPerTrasparenza createTrovaPerTrasparenza() {
        return new TrovaPerTrasparenza();
    }

    /**
     * Create an instance of {@link TrovaPerTrasparenzaResponse }
     * 
     */
    public TrovaPerTrasparenzaResponse createTrovaPerTrasparenzaResponse() {
        return new TrovaPerTrasparenzaResponse();
    }

    /**
     * Create an instance of {@link TrovaTutteOrganizzazioni }
     * 
     */
    public TrovaTutteOrganizzazioni createTrovaTutteOrganizzazioni() {
        return new TrovaTutteOrganizzazioni();
    }

    /**
     * Create an instance of {@link TrovaTutteOrganizzazioniResponse }
     * 
     */
    public TrovaTutteOrganizzazioniResponse createTrovaTutteOrganizzazioniResponse() {
        return new TrovaTutteOrganizzazioniResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaOrganizzazione }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggiornaOrganizzazione }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "aggiornaOrganizzazione")
    public JAXBElement<AggiornaOrganizzazione> createAggiornaOrganizzazione(AggiornaOrganizzazione value) {
        return new JAXBElement<AggiornaOrganizzazione>(_AggiornaOrganizzazione_QNAME, AggiornaOrganizzazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaOrganizzazioneResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggiornaOrganizzazioneResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "aggiornaOrganizzazioneResponse")
    public JAXBElement<AggiornaOrganizzazioneResponse> createAggiornaOrganizzazioneResponse(AggiornaOrganizzazioneResponse value) {
        return new JAXBElement<AggiornaOrganizzazioneResponse>(_AggiornaOrganizzazioneResponse_QNAME, AggiornaOrganizzazioneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiungiOrganizzazione }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggiungiOrganizzazione }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "aggiungiOrganizzazione")
    public JAXBElement<AggiungiOrganizzazione> createAggiungiOrganizzazione(AggiungiOrganizzazione value) {
        return new JAXBElement<AggiungiOrganizzazione>(_AggiungiOrganizzazione_QNAME, AggiungiOrganizzazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiungiOrganizzazioneResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggiungiOrganizzazioneResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "aggiungiOrganizzazioneResponse")
    public JAXBElement<AggiungiOrganizzazioneResponse> createAggiungiOrganizzazioneResponse(AggiungiOrganizzazioneResponse value) {
        return new JAXBElement<AggiungiOrganizzazioneResponse>(_AggiungiOrganizzazioneResponse_QNAME, AggiungiOrganizzazioneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaOrganizzazione }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminaOrganizzazione }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "eliminaOrganizzazione")
    public JAXBElement<EliminaOrganizzazione> createEliminaOrganizzazione(EliminaOrganizzazione value) {
        return new JAXBElement<EliminaOrganizzazione>(_EliminaOrganizzazione_QNAME, EliminaOrganizzazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaOrganizzazioneResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminaOrganizzazioneResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "eliminaOrganizzazioneResponse")
    public JAXBElement<EliminaOrganizzazioneResponse> createEliminaOrganizzazioneResponse(EliminaOrganizzazioneResponse value) {
        return new JAXBElement<EliminaOrganizzazioneResponse>(_EliminaOrganizzazioneResponse_QNAME, EliminaOrganizzazioneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizzazioneBenefica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizzazioneBenefica }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "organizzazioneBenefica")
    public JAXBElement<OrganizzazioneBenefica> createOrganizzazioneBenefica(OrganizzazioneBenefica value) {
        return new JAXBElement<OrganizzazioneBenefica>(_OrganizzazioneBenefica_QNAME, OrganizzazioneBenefica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerBilancio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerBilancio }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "trovaPerBilancio")
    public JAXBElement<TrovaPerBilancio> createTrovaPerBilancio(TrovaPerBilancio value) {
        return new JAXBElement<TrovaPerBilancio>(_TrovaPerBilancio_QNAME, TrovaPerBilancio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerBilancioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerBilancioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "trovaPerBilancioResponse")
    public JAXBElement<TrovaPerBilancioResponse> createTrovaPerBilancioResponse(TrovaPerBilancioResponse value) {
        return new JAXBElement<TrovaPerBilancioResponse>(_TrovaPerBilancioResponse_QNAME, TrovaPerBilancioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerId }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "trovaPerId")
    public JAXBElement<TrovaPerId> createTrovaPerId(TrovaPerId value) {
        return new JAXBElement<TrovaPerId>(_TrovaPerId_QNAME, TrovaPerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "trovaPerIdResponse")
    public JAXBElement<TrovaPerIdResponse> createTrovaPerIdResponse(TrovaPerIdResponse value) {
        return new JAXBElement<TrovaPerIdResponse>(_TrovaPerIdResponse_QNAME, TrovaPerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerProgetti }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerProgetti }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "trovaPerProgetti")
    public JAXBElement<TrovaPerProgetti> createTrovaPerProgetti(TrovaPerProgetti value) {
        return new JAXBElement<TrovaPerProgetti>(_TrovaPerProgetti_QNAME, TrovaPerProgetti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerProgettiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerProgettiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "trovaPerProgettiResponse")
    public JAXBElement<TrovaPerProgettiResponse> createTrovaPerProgettiResponse(TrovaPerProgettiResponse value) {
        return new JAXBElement<TrovaPerProgettiResponse>(_TrovaPerProgettiResponse_QNAME, TrovaPerProgettiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerTrasparenza }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerTrasparenza }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "trovaPerTrasparenza")
    public JAXBElement<TrovaPerTrasparenza> createTrovaPerTrasparenza(TrovaPerTrasparenza value) {
        return new JAXBElement<TrovaPerTrasparenza>(_TrovaPerTrasparenza_QNAME, TrovaPerTrasparenza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerTrasparenzaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerTrasparenzaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "trovaPerTrasparenzaResponse")
    public JAXBElement<TrovaPerTrasparenzaResponse> createTrovaPerTrasparenzaResponse(TrovaPerTrasparenzaResponse value) {
        return new JAXBElement<TrovaPerTrasparenzaResponse>(_TrovaPerTrasparenzaResponse_QNAME, TrovaPerTrasparenzaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTutteOrganizzazioni }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaTutteOrganizzazioni }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "trovaTutteOrganizzazioni")
    public JAXBElement<TrovaTutteOrganizzazioni> createTrovaTutteOrganizzazioni(TrovaTutteOrganizzazioni value) {
        return new JAXBElement<TrovaTutteOrganizzazioni>(_TrovaTutteOrganizzazioni_QNAME, TrovaTutteOrganizzazioni.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTutteOrganizzazioniResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaTutteOrganizzazioniResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://organizzazioneBenefica/", name = "trovaTutteOrganizzazioniResponse")
    public JAXBElement<TrovaTutteOrganizzazioniResponse> createTrovaTutteOrganizzazioniResponse(TrovaTutteOrganizzazioniResponse value) {
        return new JAXBElement<TrovaTutteOrganizzazioniResponse>(_TrovaTutteOrganizzazioniResponse_QNAME, TrovaTutteOrganizzazioniResponse.class, null, value);
    }

}
