// Driver Class

import java.io.IOException;

public class Main
{
    // Main Method
    public static void main(String[] args) throws IOException
    {
        Server server = new Server(8000);
        server.start();
    }
}