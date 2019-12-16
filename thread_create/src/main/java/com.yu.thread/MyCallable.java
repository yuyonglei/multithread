package com.yu.thread;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * @Author yyl
 * @Date 2019/12/16 0016 下午 8:01
 * @Version 1.0
 */
public class MyCallable implements Callable<String> {
    public String call() throws Exception {
        for (int i=0;i<10;i++){
            System.out.println("子线程执行："+new Date().getTime());
        }
        return null;
    }
}
