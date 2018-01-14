package esi.rmi.hello;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl implements Hello {

    private HelloImpl() {}

    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String args[]) {

        try {
            Hello obj = new HelloImpl();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello", stub);

            System.err.println("Hello-RMI-object ready");
        } catch (Exception e) {
            System.err.println("Hello-RMI-object exception: " + e.toString());
            e.printStackTrace();
        }
    }
}