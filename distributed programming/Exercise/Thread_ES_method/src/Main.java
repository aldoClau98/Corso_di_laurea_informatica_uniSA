import java.util.logging.*;
public class Main {
	public static void main(String[] args) {
	//Errore sull'inconsistenza della memoria
	double  start= System.nanoTime();
	boolean flag=true;
	int increment=10;
	int number=2;
	int p=0;
	Counter c = new Counter();
	
	CounterThread[] array = new CounterThread[number];
	
	for(int i=0;i<number;i++) {
		array[i] = new CounterThread(increment/number, c , flag);
		if(flag) {
			flag=false;
		}else flag=true;
	}
	
	for(int i=0;i<number;i++) {
		array[i].start();
	}
	
	
	for(int i=0;i<number; i++) {
		try {
			array[i].join();
			p +=array[i].getCount();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	double and =  System.nanoTime();
	System.out.println("seconds: "+((and-start)/1e9));
	System.out.println("incremento: "+p);
	
}

}
