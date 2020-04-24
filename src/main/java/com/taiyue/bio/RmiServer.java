package com.taiyue.bio;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiServer extends Remote {
       void sayHello()throws RemoteException;
       String hello(String name)throws RemoteException;
}
