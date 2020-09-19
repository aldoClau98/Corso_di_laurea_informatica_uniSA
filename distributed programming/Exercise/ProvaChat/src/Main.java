
 
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Logger;
 
public class Main {
    static Logger logger = Logger.getLogger("Global");
 
    public static void main(String args[]) {
        try {
            String nome = "", in = "", out = "";
 
            Socket socket = new Socket(InetAddress.getByName("172.19.210.73"), 10700);
            //Socket socket = new Socket("localhost",10700);
            logger.info("Dopo new socket\n");
            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
 
            logger.info("Benvenuto, scrivi il tuo nome per iniziare la chat:\n");
            Scanner scanner = new Scanner(System.in);
            nome = scanner.next();
            outStream.writeObject(nome);
            in = (String) inStream.readObject();
            logger.info(in);// benvenuto, nome
 
            while (true) {
                logger.info("Digita off per terminare, altrimenti scrivi un messaggio:\n");
 
                out = scanner.nextLine();
                outStream.writeObject(out);
                outStream.flush();
                if (out.equals("off")) {
                    logger.info("Bye bye\n");
                    socket.close();
                    break;
                }
                logger.info("Attendo messaggio..\n");
                in = (String) inStream.readObject();
                logger.info("Nuovo messaggio:\t" + in);
                if (in.equals("off")) {
                    logger.info("Bye bye\n");
                    socket.close();
                    break;
                }
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}