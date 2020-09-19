
public class CounterThread extends Thread {
	private int j;
	private Counter c;
	private boolean flag;

	public CounterThread(int j, Counter c, boolean flag) {
		this.j = j;
		this.c = c;
		this.flag = flag;
	}

	public void run() {
		if (flag) {
			for (int i = 0; i < j; i++) {

				c.increment();
			}
		} else {
			for (int i = 0; i < j; i++) {

				c.decrement();
			}
		}
	}
	public  int  getCount() {
		return c.getC();
	}
}
