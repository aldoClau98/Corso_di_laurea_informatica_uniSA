package Thread;

public class Hellothread extends Thread {
	
	private long[] array;
	private int start;
	private int end;
	
	public Hellothread(long[] array,int start, int end) {
		
		this.array=array;
		this.start=start;
		this.end=end;
		
	}
	
	public void  run() {
	
		for(int i= (int) start;i<(int) end;i++) {
			array[i]=1;
		}

	}
	

}
