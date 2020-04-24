package com.taiyue.bio;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiServerImpl extends UnicastRemoteObject implements RmiServer {

    protected RmiServerImpl() throws RemoteException {
        super();
    }

@Override
    public void sayHello() {
        System.out.println("你好");
    }
    @Override
    public String hello(String name) {
        return "hello"+name;
    }
}
