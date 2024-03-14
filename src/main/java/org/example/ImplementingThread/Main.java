package org.example.ImplementingThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();

        //start() - java.lang.Thread
        Thread thread=new Thread(myThread);
        thread.start();


//shortcut to create a new thread
        //create a new thread
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("testing thread");
            }
        };
        Thread thread1=new Thread(runnable);
        thread1.start();


        //lambda expression
        Runnable r=()->{
            System.out.println("testing 2nd thread");
        };
        Thread thread2=new Thread(r);
        thread2.start();
    }
}
