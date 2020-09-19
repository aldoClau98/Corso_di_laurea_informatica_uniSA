
public class Main {
	
	
	

	
	public static void main(String[] args) {
		
		
		double starttime = System.nanoTime();
		int c=0;
		
	    int MAXnumber = 1000000000;
		int size = 16;
		Object[] array = new Object[size];

		for (int i = 0; i < size; i++) {
			array[i] = new Pgreco(MAXnumber/size);
		}
		for (int i = 0; i < size; i++) {
			((Pgreco) array[i]).start();
			
		}
		
		for(int i=0; i<size;i++) {
			try {
				((Pgreco) array[i]).join();
				c+=((Pgreco) array[i]).getC();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		double pi = 4.0 * c / MAXnumber;
		double endtime = System.nanoTime();
		
		System.out.println("Second: " + ((endtime - starttime) / 1e9));
		System.out.println("pigreco: " + pi);
	}

}
