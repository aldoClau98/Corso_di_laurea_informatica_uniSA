
public class HelloThread extends Thread {
	
	private long [] array;
	private int start;
	private int end;
	private int somma;
	public HelloThread(long[] array, int start, int end ,  int somma) {
		this.array=array;
		this.start=start;
		this.end=end;
		this.somma=somma;
	}
	
	public void run() {

		sommanumeri(array);		
	}
	 public void sommanumeri(long[] array) {

		for(int i=start;i<end;i++) {
			somma +=array[i];
		}
		
	
	}
	public int returnSomma() {
		return somma;
	}

}
