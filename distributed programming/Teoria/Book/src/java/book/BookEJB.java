/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
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
@Interceptors(Bookinterceptor.class)
public class BookEJB implements BookEJBRemote{
    
    @Inject
    private EntityManager em;
    
    public BookEJB(){
        
    }
    public void addBook(Book b){
        em.persist(b);
    }
    public void removeBook(Book b){
        em.remove(em.merge(b));
    }
    public Book updateBook(Book b){
        em.merge(b);
        return b;
    }

    @Override
    public List<Book> findAllBook() {

        TypedQuery<Book> query;
        query = em.createNamedQuery(Book.FIND_ALL,Book.class);
        return query.getResultList();

    }

    @Override
    public Book findById(String id) {
    
    TypedQuery<Book> query;
    query = em.createNamedQuery(Book.FIND_BYID,Book.class);
    query.setParameter(1, "2");
    return query.getSingleResult();
    }
    
    
}
