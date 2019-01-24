package esi.rmi.refhello;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RefHelloImpl implements RefHello {

    private Message msg;

    public RefHelloImpl() {
        msg = new Message("Hello world.");
    }

    @Override
    public Message getMessage() throws RemoteException {
        return msg;
    }


    public static void main(String args[]) {

        try {
            RefHello obj = new RefHelloImpl();
            RefHello stub = (RefHello) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("RefHello", stub);

            System.err.println("RefHello-RMI-object ready");
        } catch (Exception e) {
            System.err.println("RefHello-RMI-object exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
