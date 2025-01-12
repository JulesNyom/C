import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class HomeHandler implements HttpHandler {
    @Override
public void handle(HttpExchange exchange) throws IOException {
    String response = "Hello server!";
    exchange.sendResponseHeaders(200, response.length());
    try (OutputStream os = exchange.getResponseBody()) {
        os.write(response.getBytes());
    }
}    
}
