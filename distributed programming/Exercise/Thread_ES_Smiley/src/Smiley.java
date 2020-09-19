


public class Smiley extends Thread {
	
	public void run() {
		while (true) {
			try { 
				
				printduepunti();
				printtrattino();
				printparentesichiusa();
				
				
				// L TUO CODICE VA QUI
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void printparentesichiusa() throws InterruptedException {
		System.out.println(")");
		Thread.sleep(100);
	}

	private void printtrattino() throws InterruptedException {
		System.out.print("-");
		Thread.sleep(100);
	}

	private void printduepunti() throws InterruptedException {
		System.out.print(":");
		Thread.sleep(100);
	}

	
}