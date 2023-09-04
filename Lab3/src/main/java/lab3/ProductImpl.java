package lab3;

import java.rmi.*;
import java.rmi.server.*;
public class ProductImpl extends UnicastRemoteObject
        implements Product {
    private String name;
    private int ageLow;
    private int ageHigh;
    private int sex;
    private String hobby;

    public ProductImpl (String n, int s, int age1, int age2, String h)
            throws RemoteException {
        name = n;
        ageLow = age1;
        ageHigh = age2;
        sex = s;
        hobby = h;
    }

    public boolean match(Customer c) {
        if (c.getAge() < ageLow || c.getAge() > ageHigh)
            return false;
        if (!c.hasHobby(hobby))
            return false;
        if ((sex & c.getSex()) == 0)
            return false;
        return true;
    }

    public String getDescription() throws RemoteException {
        return "I am a " + name + ". Buy me!";
    }
}