
public class Counter  {
	private int  c;
	
	public synchronized void   increment() {
		c++;
	}
	public  synchronized void  decrement() {
		c--;
	}
	public synchronized int getC() {
		return c;
	}

}
