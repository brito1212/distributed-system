package lab2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClockClient {
	

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Clock c = (Clock) Naming.lookup("rmi://localhost/CalculatorService");
			for(;;) {
				String menu = c.menu();
				System.out.println(menu);
				int opcao = sc.nextInt();
				String result = c.printOption(opcao);
				System.out.println(result);
				if(opcao == 3) {
					break;
				}
			}
			System.out.println("Saindo...");
			sc.close();
		} catch (MalformedURLException murle) {
			System.out.println();
			System.out.println("MalformedURLException");
			System.out.println(murle);
		} catch (RemoteException re) {
			System.out.println();
			System.out.println("RemoteException");
			System.out.println(re);
		} catch (NotBoundException nbe) {
			System.out.println();
			System.out.println("NotBoundException");
			System.out.println(nbe);
		} catch (java.lang.ArithmeticException ae) {
			System.out.println();
			System.out.println("java.lang.ArithmeticException");
			System.out.println(ae);
		}
	}
}