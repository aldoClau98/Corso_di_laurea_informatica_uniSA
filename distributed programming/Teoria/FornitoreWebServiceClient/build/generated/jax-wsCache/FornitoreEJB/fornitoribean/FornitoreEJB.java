
package fornitoribean;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FornitoreEJB", targetNamespace = "http://fornitoriBean/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FornitoreEJB {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "update", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.UpdateResponse")
    @Action(input = "http://fornitoriBean/FornitoreEJB/updateRequest", output = "http://fornitoriBean/FornitoreEJB/updateResponse")
    public void update(
        @WebParam(name = "arg0", targetNamespace = "")
        Fornitore arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.DeleteResponse")
    @Action(input = "http://fornitoriBean/FornitoreEJB/deleteRequest", output = "http://fornitoriBean/FornitoreEJB/deleteResponse")
    public void delete(
        @WebParam(name = "arg0", targetNamespace = "")
        Fornitore arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "create", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.CreateResponse")
    @Action(input = "http://fornitoriBean/FornitoreEJB/createRequest", output = "http://fornitoriBean/FornitoreEJB/createResponse")
    public void create(
        @WebParam(name = "arg0", targetNamespace = "")
        Fornitore arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns fornitoribean.Fornitore
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCognome", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.FindCognome")
    @ResponseWrapper(localName = "findCognomeResponse", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.FindCognomeResponse")
    @Action(input = "http://fornitoriBean/FornitoreEJB/findCognomeRequest", output = "http://fornitoriBean/FornitoreEJB/findCognomeResponse")
    public Fornitore findCognome(
        @WebParam(name = "arg0", targetNamespace = "")
        Fornitore arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns fornitoribean.Fornitore
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findId", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.FindId")
    @ResponseWrapper(localName = "findIdResponse", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.FindIdResponse")
    @Action(input = "http://fornitoriBean/FornitoreEJB/findIdRequest", output = "http://fornitoriBean/FornitoreEJB/findIdResponse")
    public Fornitore findId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<fornitoribean.Fornitore>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.FindAllResponse")
    @Action(input = "http://fornitoriBean/FornitoreEJB/findAllRequest", output = "http://fornitoriBean/FornitoreEJB/findAllResponse")
    public List<Fornitore> findAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<fornitoribean.Fornitore>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findMax", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.FindMax")
    @ResponseWrapper(localName = "findMaxResponse", targetNamespace = "http://fornitoriBean/", className = "fornitoribean.FindMaxResponse")
    @Action(input = "http://fornitoriBean/FornitoreEJB/findMaxRequest", output = "http://fornitoriBean/FornitoreEJB/findMaxResponse")
    public List<Fornitore> findMax(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}