package com.taiyue.bio;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RmiServerBind  {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            RmiServer rmiServer = new RmiServerImpl();
            Naming.rebind("//127.0.0.1:1099/Hello", rmiServer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

