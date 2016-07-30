package com.junsh.test;

/**
 * Created by zjladmin on 2016/7/30.
 */
public class MainThread {
    public static void main(String args[]){
        LiftOff launch=new LiftOff();
        launch.run();
        System.out.println("Waiting for LiftOff!");
    }
}
