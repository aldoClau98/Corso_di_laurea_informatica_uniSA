import java.io.Serializable;

public class Somma implements Serializable {
	private static final long serialversionUID =1L;
	
	public Somma(int a, int b) {
		this.a=a;
		this.b=b;
		
	}
	
	
	public int  somma() {
		return a+b;
	}
	
	
	public  int  getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	private int a;
	private int b;
	

}
