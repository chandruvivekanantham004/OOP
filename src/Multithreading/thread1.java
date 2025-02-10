package Multithreading;

public class thread1 extends Thread{

    thread1(String threadname){
        super(threadname);
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread()+" "+i);
        }
    }
}
