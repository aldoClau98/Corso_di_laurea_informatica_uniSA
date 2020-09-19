/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitoriBean;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ALDO
 */
public class DatabaseProducer {
@PersistenceContext(unitName="FornitorePU")
@Produces
private EntityManager em;    
}
