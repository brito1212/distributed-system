package lab2;

import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class ClockImpl extends java.rmi.server.UnicastRemoteObject implements Clock {
	Scanner sc = new Scanner(System.in);
	// Implementations must have an explicit constructor
	// in order to declare the RemoteException exception
	public ClockImpl() throws java.rmi.RemoteException {
		super();
	}
	
	public String menu() throws java.rmi.RemoteException {
		String hora = "1 - Hora\n";
		String data = "2 - Data\n";
		String sair = "3 - Sair\n";
		String opcao = "Digite a opcao: ";
		return hora + data + sair + opcao;
	}
	
	
	public String hora() throws java.rmi.RemoteException {
		LocalTime horaAtual = LocalTime.now();
    	String horaString = "Hora atual: " + horaAtual;
    	return horaString;
	}
	
	public String data() throws java.rmi.RemoteException {
		Date dataAtual = new Date();
    	String dataString = "Data atual: " + dataAtual;
    	return dataString;
	}
	
	public String printOption(int option) throws java.rmi.RemoteException {
		String s = "";
		switch(option) {
			case 1:
				s = hora();
				break;
			case 2:
				s = data();
				break;
		}
		
		return s;
	}
}