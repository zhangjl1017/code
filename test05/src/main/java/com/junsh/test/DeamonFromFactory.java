package com.junsh.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by zjladmin on 2016/7/31.
 */
public class DeamonFromFactory implements Runnable {
    public void run(){
        try{
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread()+" "+this);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted!");
        }
    }

    public static void main(String[] args) throws Exception{
        ExecutorService exec= Executors.newCachedThreadPool(new DeamonThreadFactory());
        for(int i=0;i<5;i++)
            exec.execute(new DeamonFromFactory());
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
