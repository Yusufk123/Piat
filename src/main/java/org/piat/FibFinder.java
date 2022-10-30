package org.piat;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class FibFinder implements HttpHandler {
    public void handle(HttpExchange t) throws IOException {
        int n = 10;
        String response = "The " + n + "th term of the Fibonacci sequence is " + fibRecursive.fibR(n) + ". ";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
