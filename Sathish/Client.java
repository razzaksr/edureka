//package sathish.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client 
{
	MyInter my;
	int[] all={89,34,11,5,3,90};
	public Client() throws MalformedURLException, RemoteException, NotBoundException
	{
		my=(MyInter)Naming.lookup("//localhost/find");
		System.out.println(my.minFind(all));;
	}
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException 
	{
		Client c=new Client();
	}
}
