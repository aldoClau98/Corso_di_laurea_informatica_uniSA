/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museowebservicesclient;

import java.util.List;
import museo.Museo;

/**
 *
 * @author ALDO
 */
public class MuseoWebServicesClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<Museo> lista = findAll();
    }

    private static java.util.List<museo.Museo> findAll() {
        museo.MuseoEJBService service = new museo.MuseoEJBService();
        museo.MuseoEJB port = service.getMuseoEJBPort();
        return port.findAll();
    }
 
   
    
    
}
