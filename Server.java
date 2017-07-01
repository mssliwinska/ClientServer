import java.io.*;
import java.net.*;

public class Server {
  public static void main(String[] arg) {
    TextMessage myTextMessage = null;
    try{
        ServerSocket myServerSocket = new ServerSocket(11111);

        System.out.println("Ready\n");

        Socket incoming = myServerSocket.accept();

        ObjectInputStream myInputStream = new ObjectInputStream(incoming.getInputStream());

        myTextMessage = (TextMessage)myInputStream.readObject();

        System.out.println(myTextMessage.getName() + " : " + myTextMessage.getTextMessage() + "\n");

        myInputStream.close();
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}
