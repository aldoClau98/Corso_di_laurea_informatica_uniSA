/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author ALDO
 */


@Interceptor
public class MuseoInterceptor {
    int i = 0;
    
    
    
    @Counter
    @AroundInvoke
    public Object museoInterceptor(InvocationContext ic) throws Exception{
      i++;
           System.out.println(ic.getMethod().getName()+"? stato invocato "+i+" volte\n");
        
        return ic.proceed();
    }
    
}
