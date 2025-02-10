package Multithreading;

public class Deadlock {
    public static void main(String[] args) {
        String lock1="max";
        String lock2= "well";
        System.out.println("main is starting");
        Thread thread1 = new Thread(() ->
        {
            synchronized (lock1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                synchronized (lock2) {
                    System.out.println("I AM IN THREAD1");
                }
            }
        },"thread1");

        Thread thread2 = new Thread(() ->
        {
            synchronized (lock2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                synchronized (lock1) {
                    System.out.println("I AM IN THREAD1");
                }
            }
        },"thread2");
        thread1.start();
        thread2.start();
    }
}
