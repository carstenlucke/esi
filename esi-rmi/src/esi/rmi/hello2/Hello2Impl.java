package esi.rmi.hello2;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Hello2Impl implements Hello2 {

    private String message;

    public Hello2Impl() {
        this.message = "Hello world!";
    }


    @Override
    public String sayHello() throws RemoteException {
        return message;
    }

    @Override
    public void changeMessage(String newMessage) throws RemoteException {
        message = newMessage;
    }

    public static void main(String args[]) {

        try {
            Hello2 obj = new Hello2Impl();
            Hello2 stub = (Hello2) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("Hello2", stub);

            System.err.println("Hello2Server ready");
        } catch (Exception e) {
            System.err.println("Hello2Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}