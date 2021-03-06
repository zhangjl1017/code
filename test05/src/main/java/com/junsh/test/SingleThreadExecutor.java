package com.junsh.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zjladmin on 2016/7/30.
 */
public class SingleThreadExecutor {
    public static void main(String args[]){
        ExecutorService exec= Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
