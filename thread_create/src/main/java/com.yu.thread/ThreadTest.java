package com.yu.thread;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @Author yyl
 * @Date 2019/12/16 0016 下午 7:40
 * @Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        //启动主线程
        //1.继承thread类
        /*MyThread ms = new MyThread();
        ms.start();
        for (int i=0;i<10;i++){
            System.out.println("主线程执行了："+new Date().getTime());
        }*/
        //2.实现runnable接口
        /*for (int i=0;i<10;i++){
            System.out.println("主线程执行了："+new Date().getTime());
        }
        Thread th = new Thread(new MyRunnable(),":MyRunnable");//
        th.start();*/
        //3.实现callable接口
        //创建futureTask实例，创建Thread实例
        FutureTask<String> ta = new FutureTask<String>(new MyCallable());
        Thread th = new Thread(ta ,"MyCallable");
        th.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行了："+new Date().getTime());
        }
        try {
            String result = ta.get();
            System.out.println("MyCallable"+result);
        }catch (ExecutionException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //4.使用线程池创建线程
        //4.使用Executor
       /* ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new MyRunnable());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行了："+new Date().getTime());
        }*/
    }
}
