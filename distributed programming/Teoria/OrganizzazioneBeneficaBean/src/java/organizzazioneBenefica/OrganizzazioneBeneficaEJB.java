package organizzazioneBenefica;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@WebService
@Stateless
@LocalBean
public class OrganizzazioneBeneficaEJB implements OrganizzazioneBeneficaEJBRemote {
    @Inject 
    private EntityManager em;
    
    @Override
    public void aggiungiOrganizzazione(OrganizzazioneBenefica o) {
        em.persist(o);
    }

    @Override
    public void aggiornaOrganizzazione(OrganizzazioneBenefica o) {
        em.merge(o);
    }

    @Override
    public void eliminaOrganizzazione(OrganizzazioneBenefica o) {
        em.remove(em.merge(o));
    }

    @Override
    public List<OrganizzazioneBenefica> trovaTutteOrganizzazioni() {
        TypedQuery<OrganizzazioneBenefica> query = em.createNamedQuery(OrganizzazioneBenefica.TROVA_TUTTI, OrganizzazioneBenefica.class);
        return query.getResultList();
    }

    @Override
    public List<OrganizzazioneBenefica> trovaPerProgetti(int numeroProgetti) {
        TypedQuery<OrganizzazioneBenefica> query = em.createNamedQuery(OrganizzazioneBenefica.TROVA_PER_PROGETTI, OrganizzazioneBenefica.class);
        query.setParameter("progetti", numeroProgetti);
        return query.getResultList();
    }

    @Override
    public OrganizzazioneBenefica trovaPerId(long id) {
        TypedQuery<OrganizzazioneBenefica> query = em.createNamedQuery(OrganizzazioneBenefica.TROVA_PER_ID, OrganizzazioneBenefica.class);
        query.setParameter(1, id);
        return query.getSingleResult();
    }

    @Override
    @Counter
    public List<OrganizzazioneBenefica> trovaPerBilancio() {
        TypedQuery<OrganizzazioneBenefica> query = em.createNamedQuery(OrganizzazioneBenefica.TROVA_PER_BILANCIO, OrganizzazioneBenefica.class);
        return query.getResultList();    }

    @Override
    public List<OrganizzazioneBenefica> trovaPerTrasparenza() {
        TypedQuery<OrganizzazioneBenefica> query = em.createNamedQuery(OrganizzazioneBenefica.TROVA_PER_TRASPARENZA, OrganizzazioneBenefica.class);
        return query.getResultList();
    }

}
