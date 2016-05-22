package com.chenzhicheng.rmitest.impl;

import com.chenzhicheng.rmitest.interfaces.Test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Administrator on 2016/5/22.
 */
public class TestImpl extends UnicastRemoteObject implements Test {

    public TestImpl() throws RemoteException{

    }

    public void sayHello(String name) throws RemoteException {
        System.out.println("hello " + name);
    }

    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
