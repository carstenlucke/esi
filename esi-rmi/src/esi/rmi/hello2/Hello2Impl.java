package esi.rmi.hello2;

public class Hello2Impl implements Hello2 {

    private String message;

    public Hello2Impl() {
        this.message = "Hello world!";
    }


    @Override
    public String sayHello() {
        // TODO: Implementieren!
        return null;
    }

    @Override
    public void changeMessage(String newMessage) {
        // TODO: Implementieren!
    }

    public static void main(String args[]) {

        try {
            Hello2 obj = new Hello2Impl();

            // TODO: obj als Remote-Objekt exportieren und den Stub erhalten

            // TODO: Binding des Remote-Objekt-Stub an die Registry

            System.err.println("Hello2Server ready");
        } catch (Exception e) {
            System.err.println("Hello2Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}