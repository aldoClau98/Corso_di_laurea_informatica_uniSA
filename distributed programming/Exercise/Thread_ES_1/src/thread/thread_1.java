package thread;

public class thread_1 extends Thread {
	
	public void run() {
		
		String[] 	array = new String[60000000];
	

		for(int i=0;i<60000000;i++) {
			array[i]="42";
		}
		
		
		
	}

	
		
	
}
