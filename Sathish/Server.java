//package sathish.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInter
{
	public Server() throws RemoteException, MalformedURLException
	{
super();
		Naming.rebind("find",this);
	}
	public static void main(String[] args) throws RemoteException, MalformedURLException 
	{
		Server s=new Server();
	}

	@Override
	public int minFind(int[] r) throws RemoteException 
	{
		int min=r[0];
		for(int j:r)
		{
			if(min>j){min=j;}
		}
		return min;
	}
}
