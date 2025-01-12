import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.*;
public class Server {

    private HttpServer server;
    private final int port;

    public Server (int port) {
        this.port = port;
    }

    public void start () throws IOException {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", new HomeHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server is running bro");
    }
}