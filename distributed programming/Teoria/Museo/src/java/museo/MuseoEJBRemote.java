/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ALDO
 */
@Remote
public interface MuseoEJBRemote {
    
    public List<Museo> findAll();
    public Museo findId(String id);
    public Museo findReg(String reg);
    
}
