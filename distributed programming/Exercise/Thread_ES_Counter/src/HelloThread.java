 
public class HelloThread extends Thread {
	int num;
	Counter c;
	public  HelloThread(Counter c,int increment) {
		this.num=increment;
		this.c=c;
	}
	public void run () {
		
		for(int i=0;i<num;i++) {
			c.incremento();
		}
		
	}
	public  int result() {
		return c.getResult();
	}

}
