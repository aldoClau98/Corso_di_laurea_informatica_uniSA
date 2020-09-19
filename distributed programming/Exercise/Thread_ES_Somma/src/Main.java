
public class Main {
public static void main(String[] args) {
	
	long startTime =System.nanoTime();
	
	//inizializzo le variabili  che mi  servono per i  thread
		int somma=0;
		int size= 120000000;
		long[] array = new long[size];
		for(int i=0;i<size;i++) {
			array[i]=1;
		}
		int number=2;
		int start=0;
		int end  = size/number;
		
		//creo  un array di  thread
		
		Object[] thread= new Object[number];
		
		
		for(int i=0;i<number;i++) {
			thread[i]=new HelloThread(array,start,end,somma);
			((Thread) thread[i]).start();
			
			start +=size/number;
			end  +=size/number;
		}
		
		for(int i=0;i<number;i++) {
			try {
				((Thread)thread[i]).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int j=0;j<number;j++) {
			   somma += ((HelloThread) thread[j]).returnSomma();
			  }
		System.out.println("Somma totale " + somma);
		  long endTime =System.nanoTime();
			
			 double seconds = (double) ((endTime - startTime) / 1e9);
			System.out.println("Programma eseguito in " + seconds + " secondi");
}
}
