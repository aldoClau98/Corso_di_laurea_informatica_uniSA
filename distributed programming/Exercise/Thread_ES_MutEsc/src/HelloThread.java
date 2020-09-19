import javax.sql.rowset.spi.SyncResolver;

public class HelloThread extends Thread {
	private int size;
	private int counter=0;
	public  HelloThread(int size) {
		this.size=size;
	}
	public void run() {
		for(int i=0;i<size;i++) {
			synchronized (this) {
				counter++;
			}
			
			}
	}
	public int count() {
		return counter;
	}
}
