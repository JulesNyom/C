import java.io.IOException;

public class Main {

  public static void main () throws IOException {
    Server server = new Server(8000);
    server.start();
  }
}