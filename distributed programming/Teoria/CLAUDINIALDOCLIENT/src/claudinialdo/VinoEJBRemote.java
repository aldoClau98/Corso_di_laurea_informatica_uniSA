/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claudinialdo;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ALDO
 */
@Remote
public interface VinoEJBRemote {
    
    public List<Vino> trovaTutti();
    public List<Vino> trovaTipo(String tipo);
    public Vino trovaId(int id);
    public List<Vino> trovaProduzione(String produzione);
    public List<Vino> cercaBottiglie(int bottiglie);
    
}

