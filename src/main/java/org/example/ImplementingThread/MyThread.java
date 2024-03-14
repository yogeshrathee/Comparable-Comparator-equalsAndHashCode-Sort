package org.example.ImplementingThread;

class MyThread implements Runnable{

    @Override
    public void run(){

        //thread task
        for(int i=1;i<=20;i++){
            System.out.println("i:: "+i);


            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

     }
}
