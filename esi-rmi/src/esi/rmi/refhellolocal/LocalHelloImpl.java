package esi.rmi.refhellolocal;

public class LocalHelloImpl implements LocalHello {

    private Message msg;

    public LocalHelloImpl() {
        msg = new Message("Hello world.");
    }

    @Override
    public Message getMessage() {
        return msg;
    }
}
