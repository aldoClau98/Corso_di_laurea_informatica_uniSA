/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claudinialdo;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author ALDO
 */
@LocalBean
@Stateless
public class VinoEJB implements VinoEJBRemote{
    
    @Inject 
     EntityManager em;
    
    public VinoEJB(){
        
    }

    public void add(Vino v){ em.persist(v);}
    
    public void remove(Vino v){em.remove(em.merge(v));}
    
    public Vino update(Vino v) { return em.merge(v);}

    //Aggiunta annotazione Override sui metodi  dell'interfaccia
    //cambiati i parametri in input di query.setParameter da String ad int
    @Override
    public List<Vino> trovaTutti() {

        TypedQuery<Vino> query = em.createNamedQuery(Vino.TROVATUTTI,Vino.class);
        
        return query.getResultList();

    }

    @Override
    public List<Vino> trovaTipo(String tipo) {

         TypedQuery<Vino> query = em.createNamedQuery(Vino.TIPODIVINO,Vino.class);
         query.setParameter(1, tipo);
        return query.getResultList();
        
    }

    @Override
    public Vino trovaId(int id) {
        TypedQuery<Vino> query = em.createNamedQuery(Vino.TROVAID,Vino.class);
         query.setParameter(1, id);
        return query.getSingleResult();
    }

    @Override
    public List<Vino> trovaProduzione(String produzione) {

        TypedQuery<Vino> query = em.createNamedQuery(Vino.TROVAPERPRODUZIONE,Vino.class);
         query.setParameter(1, produzione);
        return query.getResultList();

    }

    @Override
    public List<Vino> cercaBottiglie(int bottiglie) {
        
        TypedQuery<Vino> query = em.createNamedQuery(Vino.CERCABOTTIGLIE,Vino.class);
         query.setParameter(1, bottiglie);
        return query.getResultList();

    }
    
    
}
