
public class Main {
	/*
	 * scrivere un programma che incrementa un contatore intero per 40k volte
	 * creando una classe counter e una classe incrementatore con il maoin che
	 * istanzia e usa Counter stampandolo a video ovviamente
	 */

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		// numero di thread
		int number = 1;
		int  increment = 1000000;
		// creo l' oggetto da incrementare
		int c=0;
		int somma=0;
		Counter counter = new Counter();
		// creo un array di thread
		Object[] array = new Object[number];

		for (int i = 0; i < number; i++) {
			array[i] = new HelloThread(counter, (increment / number));
		}
		
		
		for(int i= 0; i<number; i++) {
			((HelloThread) array[i]).start();
			
			try {
				((HelloThread) array[i]).join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	

		long endTime = System.nanoTime();

		double second = (double) ((endTime - startTime) / 1e9);
		System.out.println("seconds: " + second);
		System.out.println("Counter: " + counter.getResult());
	}

}
