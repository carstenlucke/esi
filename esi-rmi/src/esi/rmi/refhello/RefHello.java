package esi.rmi.refhello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RefHello extends Remote {

    Message getMessage() throws RemoteException;

}
