/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author ALDO
 */
@Interceptor
public class AutoInterceptor {
    
    public Object onAutoInterceptor(InvocationContext ic) throws Exception{
        int i=0;
        int j=0;
        int k=0;
        if(ic.getMethod().getName().equals("findAll"));
        System.out.println(ic.getMethod().getName()+"? stato chiamato : "+i+" volte");
       
       return  ic.proceed();
    }
    
}
