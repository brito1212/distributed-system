package lab2;

public interface Clock extends java.rmi.Remote {
	public String menu() throws java.rmi.RemoteException;
	
	public String hora() throws java.rmi.RemoteException;
		
	public String data() throws java.rmi.RemoteException;
	
	public String printOption(int option) throws java.rmi.RemoteException;
}