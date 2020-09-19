/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitoriBean;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
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
public class FornitoreEJB  implements FornitoreEJBRemote{
    
    @Inject
    EntityManager em;
    
   
    //metodi  CRUD
    @Override
   public void create(Fornitore f){
       em.persist(f);
       
   }
   @Override
   public void update(Fornitore f){
       em.merge(f);
   }
   @Override
   public void delete(Fornitore f){
       em.remove(em.merge(f));
   }
   @Override
   public List<Fornitore>  findAll(){
       
       TypedQuery<Fornitore> query;
       query =  em.createNamedQuery(Fornitore.FIND_ALL, Fornitore.class);
       return query.getResultList();
       
   }
 @Override
   public  Fornitore findId(int  f){
       TypedQuery<Fornitore> query;
       query= em.createNamedQuery(Fornitore.FIND_ID, Fornitore.class);
       query.setParameter(1, f);
        return query.getSingleResult();
   }
   @Override
   public Fornitore findCognome(Fornitore f){
       TypedQuery<Fornitore> query;
       query =  em.createNamedQuery(Fornitore.FIND_COGNOME, Fornitore.class);
       query.setParameter(1, f.getCognome());
       return query.getSingleResult();
   }
   @Override
   public List<Fornitore> findMax(int max){
       TypedQuery<Fornitore> query;
       query= em.createNamedQuery(Fornitore.FIND_MAXORDINE,Fornitore.class);
       query.setParameter(1, max);
       return query.getResultList();
   }

    
   
   
}
