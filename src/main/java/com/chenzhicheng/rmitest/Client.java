package com.chenzhicheng.rmitest;

import com.chenzhicheng.rmitest.impl.TestImpl;
import com.chenzhicheng.rmitest.interfaces.Test;

import java.rmi.Naming;

/**
 * Created by Administrator on 2016/5/22.
 */
public class Client {

    public static void main(String[] args) throws Exception{
        Test test = (Test)Naming.lookup("//localhost:8804/chen-rmitest-server");
        System.out.println(test);
        test.sayHello("mr.chen");
    }
}
