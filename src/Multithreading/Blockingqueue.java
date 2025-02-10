package Multithreading;
//watch 1.35 for 2 minutes :)
import java.util.LinkedList;
import java.util.Queue;

public class Blockingqueue {
    Queue<Integer> q;
    int capcity;

    public Blockingqueue(int cap) {
        q = new LinkedList<>();
        capcity = cap;
    }

    public boolean add(int element) throws InterruptedException {
        synchronized (q){
        while (capcity == q.size()) {//previously it was in if( "condition") we are making it while for our convention for preventing exception;
            System.out.println("Index out of bound");
            q.wait();
        }

        q.add(element);
        q.notifyAll();
        return true;
         }
    }
    public int poll() throws InterruptedException {
        synchronized (q) {
            while (q.size()==0) {
                System.out.println("your queue doesn't have any items");
                q.wait();
            }
            int lastelement = q.poll();
            q.notifyAll();
            return lastelement;
        }
    }
    public int size(){
        return q.size();
    }
    public boolean isempty(){
        return q.size()==0;
    }
}
