
public class Main {
	  	public static void main(String[] args) throws InterruptedException {
		double start= System.nanoTime();
	  	int counter=0;
		int increment=10000;
		int size=16;
		HelloThread[] array = new HelloThread[size];
		
		for(int i=0;i<size;i++) {
			array[i] = new HelloThread(increment/size);
		}
		
		for(int i=0;i<size;i++) {
			array[i].start();
		}
	
		for(int i =0;i<size;i++) {
			array[i].join();
		}
	for(int i=0;i<size;i++) {
			
			counter+=array[i].count();
		}
		
		System.out.println("counter: "+counter);
		double end  =  System.nanoTime();
		System.out.println("seconds: "+((end - start)/1e9));
	}

}
