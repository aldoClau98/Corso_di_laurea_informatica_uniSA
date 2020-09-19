/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import static com.sun.xml.ws.security.addressing.impl.policy.Constants.logger;
import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author ALDO
 */

@Interceptor
public class Bookinterceptor {
   // Logger logger = Logger.getLogger("Interceptor_Logger: ");
    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception{
     logger.info( ic.getMethod().getName()
                     + " e' stato invocato");
      return ic.proceed();
    }
}
