import java.util.logging.*;
/*
 * come creare un deadlock fra 3 thread*/
public class Main extends Thread {  
  public static void main(String[] args) {  
  /*
   * creo  tre risorse condivise da tutti  e tre i thread*/
   String string1="aldo";
   String string2="claudini";
   String string3="porcodio";
/*
 *il primo  thread accede all  prima risorsa  in modo atomico, il  secondo  thread ed  il terzo  fanno  la stessa cosa per le altre risorse
 *avviene he ogni  thread ha una risorla bloccata,intanto  gli  altri  thread cercano  contemporaneamente di  accedere alle risorse
 *degli  altri thread  ma le trovano  bloccate cosi si mettono in wait in attes che  si sblocchi  qualche risorsa */
  Thread th1= new Thread() {
	  public void run() {
		  
		  synchronized (string1) {
			System.out.println("Locked: "+string1);
			
			
			 synchronized (string2){
				 System.out.println("accedo  alla stringa2 "+ string2);
			 }
			 synchronized (string3){
				 System.out.println("accedo  alla stringa3 "+string3);
			 }
		}
		 
		  System.out.println("accedo  alla stringa2");
		  
	  }
  };
  
  Thread th2= new Thread() {
	  public void run() {
		  
		  synchronized (string2) {
			System.out.println("Locked: "+string2);
		
			 synchronized (string1){
				 System.out.println("accedo  alla stringa1 "+string1);
			 }
			 synchronized (string3){
				 System.out.println("accedo  alla stringa3 "+string3);
			 }
			 
		  }
		 
		  
	  }
  };
  
  Thread th3= new Thread() {
	  public void run() {
		  
		  synchronized (string3) {
			System.out.println("Locked: "+string3);
		
			 synchronized (string2){
				 System.out.println("accedo  alla stringa2 "+string2);
			 }
			 synchronized (string1){
				 System.out.println("accedo  alla stringa1 "+string1);
			 }
			 
		  }
		 
		  
	  }
  };
  
  
  th1.start();
  th2.start();
  th3.start();
  }
}  