package lab2;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ClockServer {
	public ClockServer() {
		try {
			Clock c = new ClockImpl();
			LocateRegistry.createRegistry(1099);
			Naming.rebind("rmi://localhost:1099/CalculatorService", c);
		} catch (Exception e) {
			System.out.println("Trouble: " + e);
		}
	}

	public static void main(String args[]) {
		new ClockServer();
	}
}