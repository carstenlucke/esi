package esi.echoserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMT {


    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Usage: java EchoServerMT <port number>");
            System.exit(1);
        }

        int portNumber = Integer.parseInt(args[0]);
        boolean listening = true;

        // Ihr Code hier ...
    }

}