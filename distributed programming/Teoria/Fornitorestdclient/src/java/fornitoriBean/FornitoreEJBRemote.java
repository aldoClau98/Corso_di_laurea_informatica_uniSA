/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornitoriBean;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author ALDO
 */
@Remote
public interface FornitoreEJBRemote {
    //metodi  Crud
    public void  create(Fornitore f);
    public void  update(Fornitore f);
    public void delete(Fornitore f);
    
    //logica di  business
    public  List<Fornitore> findAll();
    public Fornitore findId(Fornitore f);
    public Fornitore findCognome(Fornitore f);
    public  List<Fornitore> findMax(int max );
    
}
