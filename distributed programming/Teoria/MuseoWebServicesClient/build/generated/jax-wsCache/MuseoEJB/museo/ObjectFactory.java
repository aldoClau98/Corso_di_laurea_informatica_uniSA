
package museo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the museo package. 
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

    private final static QName _Create_QNAME = new QName("http://museo/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://museo/", "createResponse");
    private final static QName _Delete_QNAME = new QName("http://museo/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://museo/", "deleteResponse");
    private final static QName _FindAll_QNAME = new QName("http://museo/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://museo/", "findAllResponse");
    private final static QName _FindId_QNAME = new QName("http://museo/", "findId");
    private final static QName _FindIdResponse_QNAME = new QName("http://museo/", "findIdResponse");
    private final static QName _FindReg_QNAME = new QName("http://museo/", "findReg");
    private final static QName _FindRegResponse_QNAME = new QName("http://museo/", "findRegResponse");
    private final static QName _Update_QNAME = new QName("http://museo/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://museo/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: museo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindId }
     * 
     */
    public FindId createFindId() {
        return new FindId();
    }

    /**
     * Create an instance of {@link FindIdResponse }
     * 
     */
    public FindIdResponse createFindIdResponse() {
        return new FindIdResponse();
    }

    /**
     * Create an instance of {@link FindReg }
     * 
     */
    public FindReg createFindReg() {
        return new FindReg();
    }

    /**
     * Create an instance of {@link FindRegResponse }
     * 
     */
    public FindRegResponse createFindRegResponse() {
        return new FindRegResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Museo }
     * 
     */
    public Museo createMuseo() {
        return new Museo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindId }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "findId")
    public JAXBElement<FindId> createFindId(FindId value) {
        return new JAXBElement<FindId>(_FindId_QNAME, FindId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "findIdResponse")
    public JAXBElement<FindIdResponse> createFindIdResponse(FindIdResponse value) {
        return new JAXBElement<FindIdResponse>(_FindIdResponse_QNAME, FindIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindReg }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindReg }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "findReg")
    public JAXBElement<FindReg> createFindReg(FindReg value) {
        return new JAXBElement<FindReg>(_FindReg_QNAME, FindReg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindRegResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "findRegResponse")
    public JAXBElement<FindRegResponse> createFindRegResponse(FindRegResponse value) {
        return new JAXBElement<FindRegResponse>(_FindRegResponse_QNAME, FindRegResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://museo/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
