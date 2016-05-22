package com.chenzhicheng.rmitest;

import com.chenzhicheng.rmitest.impl.TestImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Created by Administrator on 2016/5/22.
 */
public class Server {

    public static void main(String[] args) throws Exception{
        TestImpl test = new TestImpl();
        System.out.println(test);
        LocateRegistry.createRegistry(8804);

        Naming.rebind("//localhost:8804/chen-rmitest-server", test);

    }


}
