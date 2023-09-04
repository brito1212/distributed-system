package lab3;


import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;


public class WarehouseServer {
    public static void main(String[] args) {
        try {
            System.out.println("Constructing server implementations...");

            WarehouseImpl w = new WarehouseImpl();
            fillWarehouse(w);

            System.out.println
                    ("Binding server implementations to registry...");

            LocateRegistry.createRegistry(1099);

            Naming.rebind("central_warehouse", w);
            System.out.println("Waiting for invocations from clients...");
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void fillWarehouse(WarehouseImpl w)
            throws RemoteException {
        w.add(new ProductImpl
                ("Bola de futsal", Product.BOTH, 18, 200, "Futsal"));
        w.add(new ProductImpl
                ("Bola de basquete", Product.BOTH, 18, 200,
                        "Basquete"));
        w.add(new ProductImpl
                ("Bola de futebol americano", Product.BOTH, 18, 200,
                        "Futebol Americano"));
        w.add(new ProductImpl
                ("Bola de tenis", Product.BOTH, 18, 200,
                        "Tenis"));
        w.add(new ProductImpl
                ("Bola de volei", Product.BOTH, 18, 200,
                        "Volei"));
        w.add(new ProductImpl
                ("Bola de futebol", Product.BOTH, 18, 200,
                        "Futebol"));
    }
}