package Thread;
import java.util.concurrent.*;
import java.util.logging.*;
public class main {
	//private final static  Logger LOGGER= Logger.getLogger(main.class.getName());
	public static void main(String[] args) {
	//LOGGER.setLevel(Level.INFO);
		long startTime =System.nanoTime();
		
		long size;
		size=4000000;
		long  array[] = new long[(int) size];
	
		int number=2;
		Object[] th = new Object[number];
		
		int start,end;
		start=0;
		end=(int)size/number;
		
		
	
		
		
		
		for(int i=0;i<number;i++) {
			//creo i  thread
			th[i] = new Hellothread(array,start,end);
			((Thread) th[i]).start();
			
			//aggiorno i  limiti  della parte da sommare
			start +=size/number;
			end +=size/number;
		}
			
		    long endTime =System.nanoTime();
		
			 double seconds = (double) ((endTime - startTime) / 1e9);
			System.out.println("Programma eseguito in " + seconds + " secondi");
			
	}
}
		
	
	


