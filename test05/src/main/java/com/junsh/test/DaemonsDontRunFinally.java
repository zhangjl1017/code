package com.junsh.test;

import java.util.concurrent.TimeUnit;

/**
 * Created by zjladmin on 2016/7/31.
 */
class ADaemon implements Runnable {
    public void run(){
        try{
            System.out.println("Starting ADaemon!");
            TimeUnit.SECONDS.sleep(1);
        }catch(InterruptedException e){
            System.out.println("Exiting via InterruptedException");
        }finally {
            System.out.println("This should always run?");
        }
    }
}
public class DaemonsDontRunFinally{
    public static void main(String[] args) throws Exception {
        Thread t=new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        //TimeUnit.SECONDS.sleep(2);
    }
}