import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Server {
    private HttpServer server;
    private final int port;

    public Server (int port) {
        this.port = port;
    }

    public void start() throws IOException {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", new HomeHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server is running on port 8000");
    }

    static class HomeHandler implements HttpHandler {
       @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello my G!";
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }

}