package com.junsh.test;

import java.util.concurrent.ThreadFactory;

/**
 * Created by zjladmin on 2016/7/31.
 */
public class DeamonThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r){
        Thread t=new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
