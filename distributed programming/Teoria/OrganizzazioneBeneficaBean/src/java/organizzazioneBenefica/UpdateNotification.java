package organizzazioneBenefica;

import javax.enterprise.event.Observes;

public class UpdateNotification {
    public void notify(@Observes OrganizzazioneBenefica o){
        System.out.println(o.getId() +" has been updated");
    }
}
