

public class Main {

public static void main(String[] args) {
		
	Object[] array = new Object[2];
	
	for(int i=0;i<2;i++) {
		array[i]= new Smiley();
		((Smiley)array[i]).start();
		
		try {
			((Smiley)array[i]).join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}