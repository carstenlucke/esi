package esi.rmi.refhellolocal;

public class LocalGreeter {

    public static void main(String[] args) {

        LocalHello subject = new LocalHelloImpl();

        Message msg = subject.getMessage();
        System.out.println(msg.text);

        msg.text = "Foo";
        System.out.println(subject.getMessage().text);

    }

}
