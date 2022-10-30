package org.piat;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        //int  n = 10;

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", new FibFinder());
        server.setExecutor(null); // creates a default executor
        server.start();

        //System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibRecursive.fibR(n) + ". ");
    }
}