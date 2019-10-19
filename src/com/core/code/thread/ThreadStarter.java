package com.core.code.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadStarter {
public static void main(String[] args) {
	Runnable1 r =  new Runnable1();
	Thread t1 =  new Thread(r);
	t1.setName("t1");
	t1.start();
	System.out.println(Thread.currentThread().getName());
ExecutorService e = Executors.newFixedThreadPool(2);
   e.execute(r);
	
   Runnable runLambda =  () -> { System.out.print("THis is from lambda");};
   new Thread(runLambda).start();
}
}
