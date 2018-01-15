package esi.rmi.hello;

public class HelloImpl implements Hello {

    private HelloImpl() {}

    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String args[]) {

        try {
            Hello obj = new HelloImpl();
            // TODO: obj als Remote-Objekt exportieren und den Stub erhalten

            // TODO: Binding des Remote-Objekt-Stub an die Registry

            System.err.println("Hello-RMI-object ready");

        } catch (Exception e) {
            System.err.println("Hello-RMI-object exception: " + e.toString());
            e.printStackTrace();
        }
    }
}