package esi.rmi.hello2;

// TODO: Implementierung der Methoden sayHello() und changeMessage()
//       soll remote via RMI method call aufrufbar sein

public interface Hello2 {
    String sayHello();
    void changeMessage(String newMessage);
}