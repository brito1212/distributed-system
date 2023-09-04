package lab3;


import java.rmi.*;
import java.util.*;
import java.rmi.server.*;


public class WarehouseImpl extends UnicastRemoteObject
        implements Warehouse {
    private Vector products;

    public WarehouseImpl() throws RemoteException {
        products = new Vector();
    }

    public synchronized void add(ProductImpl p) {
        products.add(p);
    }

    public synchronized Vector find(Customer c) throws RemoteException {
        Vector result = new Vector();
        for (Object product : products) {
            ProductImpl p = (ProductImpl) product;
            if (p.match(c))
                result.add(p);
        }

        c.reset();
        return result;
    }
}
