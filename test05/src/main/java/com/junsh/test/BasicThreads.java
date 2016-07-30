package com.junsh.test;

/**
 * Created by zjladmin on 2016/7/30.
 */
public class BasicThreads {
    public static void main(String args[]){
        Thread t=new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff!");
    }
}
