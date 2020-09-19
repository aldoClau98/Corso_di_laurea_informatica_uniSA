/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitorewebserviceclient;


import fornitoribean.Fornitore;
import fornitoribean.FornitoreEJBService;
import java.util.List;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author ALDO
 */
public class FornitoreWebServiceClient {

    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/FornitoreEJBService/FornitoreEJB.wsdl")
    private static fornitoribean.FornitoreEJBService service_1;

    
    private static FornitoreEJBService service;

  
    public static void main(String[] args) {
        
        List<Fornitore> results = findMax(3);
         for(Fornitore  o : results){
            System.out.println(o.getMaxOrdine());
        }
        
    }

    private static java.util.List<fornitoribean.Fornitore> findMax(int arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        fornitoribean.FornitoreEJB port = service_1.getFornitoreEJBPort();
        return port.findMax(arg0);
    }

   



    
    
}
