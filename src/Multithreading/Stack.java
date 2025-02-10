package Multithreading;

import java.util.Arrays;

public class Stack {
    private int[] arr;

    Stack(int e){
        arr = new int[e];
    }
    int index=0;
   public synchronized int put(int element){
       //internally it was something like this synchronized(this)
       //which is nothing but the instance of this object
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        if(index== arr.length){
            System.out.println("Index out of bound exception");

        } arr[index]=element;
        index++;

        return element;
    }
    public synchronized int poll(){

        return (arr[index--]);
    }
    boolean isempty(){
        if(arr.length==0) {
            return true;
        }
       return false;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
