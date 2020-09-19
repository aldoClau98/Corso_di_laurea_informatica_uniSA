/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author ALDO
 */
@WebService
@Stateless
@LocalBean
public class LibroEJB implements LibroEJBremote{
    @Inject 
    private EntityManager em;
    
 @Override
    public void doCreate(Libro unLibro){
        em.persist(unLibro); 
    }
    @Override
    public void  doUpdate(Libro unLibro){  
        em.merge(unLibro);
    }
  

    @Override
    public List<Libro> findAll() {
        
        TypedQuery<Libro> query;
        query= em.createNamedQuery(Libro.FINDALL,Libro.class);
        List<Libro> lista =  query.getResultList();
        
        return lista;

    }

    @Override
    public Libro findById() {

            TypedQuery<Libro> query;
            query= em.createNamedQuery(Libro.FINDBYID,Libro.class);
            query.setParameter(1, 1);
            Libro unLibro =  query.getSingleResult();
            
            return unLibro;
        


    }

    @Override
    public void doDelete(Libro unLibro) {
        em.remove(em.merge(unLibro));
    }
    
    
    
    
   
}
