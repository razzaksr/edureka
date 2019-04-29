//package sathish.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInter extends Remote
{
	public int minFind(int[] r)throws RemoteException;
}
