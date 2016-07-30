package com.junsh.test;

import java.util.concurrent.Callable;

/**
 * Created by zjladmin on 2016/7/30.
 */
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id){
        this.id=id;
    }
    public String call(){
        System.out.print(id);
        return "result of TaskWithResult " + id;
    }
}
