package com.yu.thread;

import java.util.Date;

/**
 * @Author yyl
 * @Date 2019/12/16 0016 下午 7:35
 * @Version 1.0
 */
public class MyThread extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("子线程执行了："+new Date().getTime());
        }
    }
}
