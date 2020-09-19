import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		
		String host = "localhost";
		String cmd;
		ArrayList<Somma> lista= new ArrayList<>();
		in =  new BufferedReader(new InputStreamReader(System.in));
		try {
			while(!(cmd=ask("Comandi>")).equals("quit")) {
			int temp= askInt("quante somme vuoi  fare? : ");
			for(int i=0;i<temp;i++) {
			int a =askInt("Primo addendo: ");
			int b =  askInt("Secondo addendo: ");
			Somma  s= new Somma(a,b);
			lista.add(s);
			}
			Socket socket= new Socket(host, 8000);
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			out.writeObject(lista);
			out.flush();
			socket.close();
				System.out.println("Se vuoi uscire scrivi 'quit' in qualisasi mometno: ");
				
			}
		}catch(Throwable  t) {
			t.printStackTrace();
		}
	}
	
	private static String   ask(String prompt) throws IOException{
		System.out.println(prompt+ " ");
		return (in.readLine());
	}
	
	private static int askInt(String  prompt) throws IOException{
		System.out.println(prompt+ " ");
		return (Integer.parseInt(in.readLine()));
	}
	static final String ERRORMSG="Cosa?";
	static BufferedReader in = null;

}
