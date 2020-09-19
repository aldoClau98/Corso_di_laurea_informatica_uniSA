package thread;

public class thread_2  extends Thread{
	
	public void run() {
		
		String[]   array1 = new String [60000000];

		for(int i=0;i<60000000;i++) {
			array1[i]="42";
		}
		
		
		
	}

}
