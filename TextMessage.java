import java.io.*;
import java.util.*;

public class TextMessage implements Serializable {
  public String name;
  public String message;

    TextMessage(String n) {
            message = " ";
            name = n;
    }

    public String getName() {
            return name;
          }

    public String getTextMessage() {
            return message;
    }

    public void setTextMessage(String inTextMessage) {
            message = inTextMessage;
    }
}
