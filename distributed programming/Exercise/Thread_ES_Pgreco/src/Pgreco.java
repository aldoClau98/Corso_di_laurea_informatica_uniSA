import java.util.Random;

public class Pgreco extends Thread {
	private int size; 
	private int c=0;
	public  Pgreco(int size) {
		 this.size=size;
	 }
	public void run() {
	
		Random rand = new Random();
		

		for (int i = 0; i < size; i++) {
			double x = rand.nextDouble() ;
			double y = rand.nextDouble() ;

			if ((x * x + y * y) < 1) {
				c++;
			}

		}
		
		
	}
	
	public  int getC() {
		return c;
	}

	

}
