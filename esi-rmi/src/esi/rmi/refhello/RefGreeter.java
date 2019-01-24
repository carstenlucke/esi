package esi.rmi.refhello;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RefGreeter {

    public static void main(String[] args) {

        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            RefHello stub = (RefHello) registry.lookup("RefHello");

            Message m = stub.getMessage();
            System.out.println("response: " + m.text);
            m.text = "Foobar.";

            m = stub.getMessage();
            System.out.println("response: " + m.text);


        } catch (RemoteException | NotBoundException e) {
            // Fehler bei Aufrufvermittlung behandeln
            e.printStackTrace();

        }
    }
}
