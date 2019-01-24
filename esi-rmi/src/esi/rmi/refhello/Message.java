package esi.rmi.refhello;

import java.io.Serializable;
import java.rmi.Remote;

public class Message implements Remote, Serializable {
    public String text;

    public Message(String init) {
        text = init;
    }
}
