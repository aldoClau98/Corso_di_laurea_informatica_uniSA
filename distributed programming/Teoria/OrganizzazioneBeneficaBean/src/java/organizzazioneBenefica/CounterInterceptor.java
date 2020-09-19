package organizzazioneBenefica;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Counter
public class CounterInterceptor {
    private Integer counter = 0;
    @AroundInvoke
    public Object count(InvocationContext ic) throws Exception{
        ++counter;
        System.out.println("Invoco(Entrata): Classe" + ic.getTarget().getClass().getName() +
                           " Metodo " + ic.getMethod().getName() + " chiamato " + counter + " volte");
        
        return ic.proceed();
        
    } 
       
}
