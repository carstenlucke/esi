package esi.rmi.hello2;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Greeter2 {


    public static final String CLIENT_ID = "client 1";

    public static void main(String[] args) {

        String host = (args.length < 1) ? null : args[0];

        try {

            Registry registry = LocateRegistry.getRegistry(host);
            Hello2 stub = (Hello2) registry.lookup("Hello2");
            String response = stub.sayHello();
            System.out.println("response: " + response);

            stub.changeMessage("changed by " + CLIENT_ID);

        } catch (RemoteException re) {
            // Fehler bei Aufrufvermittlung behandeln
            re.printStackTrace();

        } catch (NotBoundException nbe) {
            // kein Stub mit logischem Namen ”Hello“ registriert
            nbe.printStackTrace();
        }

    }
}