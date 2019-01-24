package esi.rmi.hello2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello2 extends Remote {
    String sayHello() throws RemoteException;
    void changeMessage(String newMessage)throws RemoteException;
}