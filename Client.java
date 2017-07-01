import java.io.*;
import java.net.*;

public class Client {
  public static void main(String[] arg) {
    try {
      String message = " ";
      String name = " ";

      System.out.print("Insert your name: ");
      name = getString();

      TextMessage myTextMessage = new TextMessage(name);

      System.out.print("Message: ");
      message = getString();

      myTextMessage.setTextMessage(message);

      Socket socketToServer = new Socket("127.0.0.1", 11111);

        ObjectOutputStream myOutputStream = new ObjectOutputStream(socketToServer.getOutputStream());

      myOutputStream.writeObject(myTextMessage);

      myOutputStream.close();
    } catch (Exception e) {System.out.println(e);}
  }

  public static String getString() throws Exception {
    BufferedReader stdin =
      new BufferedReader(new InputStreamReader(System.in), 1);
    String s1 = stdin.readLine();
    return(s1);
  }
}
