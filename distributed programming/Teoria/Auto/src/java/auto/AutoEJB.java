/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import javax.interceptor.Interceptors;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.TypedQuery;

/**
 *
 * @author ALDO
 */
@WebService
@LocalBean
@Stateless
@Interceptors(AutoInterceptor.class)
public class AutoEJB implements AutoEJBRemote{

    @Inject
    EntityManager em;
    
    
    public AutoEJB(){
        
    }
    
    public void add(@Observes  Auto a){
        em.persist(a);
    }
    public void remove( Auto a){
        em.remove(em.merge(a));
    }
    public Auto update(Auto a){
        return em.merge(a);
    }
    
    
    
    
    @Override
    public List<Auto> findAll() {

        TypedQuery<Auto> query ;
        query = em.createNamedQuery(Auto.FINDALL,Auto.class);
        return query.getResultList();
    
    
    }

    @Override
    public Auto findID(String id) {
        TypedQuery<Auto> query ;
        query = em.createNamedQuery(Auto.FINDID,Auto.class);
        query.setParameter("1", id);
        return query.getSingleResult();
    }

    @Override
    public Auto findCategoria(String categoria) {

        TypedQuery<Auto> query;
        query = em.createNamedQuery(Auto.FINDID,Auto.class);
        query.setParameter("1", categoria);
        return query.getSingleResult();
        
    }
    
    public List<Auto> ordine(int disp){
        TypedQuery<Auto> query;
        query = em.createNamedQuery(Auto.ORDINE, Auto.class);
        query.setParameter("1", disp);
        return query.getResultList();
    }
    
    
    
}
