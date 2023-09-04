package lab3;

import java.rmi.*;
import java.util.*;


public interface Warehouse extends Remote {
    public Vector find(Customer c) throws RemoteException;
}
