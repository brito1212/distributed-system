package lab3;
import java.rmi.*;


interface Product extends Remote {
    static final int MALE = 1;
    static final int FEMALE = 2;
    static final int BOTH = MALE + FEMALE;

    public String getDescription() throws RemoteException;
}

