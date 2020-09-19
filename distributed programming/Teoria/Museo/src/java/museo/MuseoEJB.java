/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptor;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author ALDO
 */
@Stateless
@LocalBean
@WebService

public class MuseoEJB implements MuseoEJBRemote{
  
   
    public MuseoEJB() {
        }
    
    
    @Inject
    private EntityManager em;
    
    public  void create(Museo m){
        em.persist(m);
    }
    public void update(Museo m){
        em.merge(m);
    }
     public void delete(Museo m){
        em.remove(em.merge(m));
    }
    @Override
    public List<Museo> findAll() {
       TypedQuery<Museo> query;
       query = em.createNamedQuery(Museo.FIND_ALL, Museo.class);
       return query.getResultList();
      
    }

    @Override
    public Museo findId(String id) {
   TypedQuery<Museo> query;
   query = em.createNamedQuery(Museo.FIND_ID, Museo.class);
   query.setParameter("1", id);
   return query.getSingleResult();
   
    }

    @Override
    @Counter
    public Museo findReg(String reg) {
    
        TypedQuery<Museo> query;
        query = em.createNamedQuery(Museo.FIND_REG, Museo.class);
        query.setParameter("1", reg);
        return query.getSingleResult();
        
    }
    
}
