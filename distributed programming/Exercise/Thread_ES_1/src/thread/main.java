package thread;

public class main {
	
	public static void main(String[] args) {

		long startTime =System.nanoTime();
		
		
		
		new  thread_1().start();
				
		new thread_2().start();
		long endTime =System.nanoTime();
	
	 double seconds = (double) ((endTime - startTime) / 1e6);

	System.out.println("Programma eseguito in " + seconds + " nanosecondi");
	}
}
