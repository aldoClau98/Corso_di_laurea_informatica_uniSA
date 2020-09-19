/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ALDO
 */
@Remote
public interface LibroEJBremote {
    
    public void doCreate(Libro unLibro);
     public void doUpdate(Libro unLibro);
      public void doDelete(Libro unLibro);
    
    public List<Libro> findAll();
    public Libro findById();
    
}
