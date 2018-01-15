package esi.rmi.hello2;

public class Greeter2 {

    // TODO: Ihr Name als client-id
    public static final String CLIENT_ID = "IHR NAME HIER";

    public static void main(String[] args) {

        String host = (args.length < 1) ? null : args[0];

        Hello2 stub = null;

        // TODO: 1. Lookup des Stub in der Registry

        String response = stub.sayHello();
        System.out.println("response: " + response);

        stub.changeMessage("changed by " + CLIENT_ID);


    }
}