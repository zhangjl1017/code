package com.junsh.test;

/**
 * Created by zjladmin on 2016/7/30.
 */
public class MoreBasicThreads {
    public static void main(String args[]){
        for(int i=0;i<10;i++){
            new Thread(new LiftOff()).start();
            System.out.println();
        }
        System.out.print("Waiting for LiftOff!");

    }
}
