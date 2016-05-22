package com.chenzhicheng.rmitest.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Administrator on 2016/5/22.
 */
public interface Test extends Remote {

    void sayHello(String name) throws RemoteException;

}
