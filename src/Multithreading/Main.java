package Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main is running");
//        Thread thread1 = new thread1("i am thread1");
//        Thread thread2 = new Thread(new thread2());//internally we have to instantiate the instance of that thread
//       //internally it was something like this inside runnable interface
//        //public void run(){
//        //    if(target!=null){
//        //       target.run();
//        //    }
//        thread2.start();
//        // thread1.start();
//        Thread thread2 = new Thread(() ->{
//            for(int i=0;i<5;i++){
//                System.out.println(Thread.currentThread()+",");
//            }
//        },"i am thread2");
//        thread2.start();
        Stack stack = new Stack(5);
        new Thread(() ->{
            int count=0;
            while(++count<5){
                System.out.println(stack.put(100));
            }

        },"pusher"
        ).start();

//        System.out.println(stack);

//        new Thread(() ->
//        { int count=0;
//            while(++count<5){
//                System.out.println(stack.poll());
//            }
//
//        },"poller"
//        ).start();
        //it gives exception because the threads are running parallel
        //we just have to make it as synchronised to avoid exception
        Thread thread3=new Thread(() ->
        {
            System.out.println(Thread.currentThread());
        },"out thread3"
        );
        thread3.start();
        thread3.join();        //thread joining
//thread3.setPriority(7);//you are able to set priority

        System.out.println(thread3.getPriority());
        System.out.println("main is exiting");

    }
}

