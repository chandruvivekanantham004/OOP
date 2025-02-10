package Collections;

import java.util.Arrays;
import java.util.Iterator;

public class OurGenericList <T> implements Iterable<T>{
   private int size;
   private T[] items;
   private int DEFAULT_SIZE=10;
   public OurGenericList(){
       size=0;
       items = (T[])new Object[DEFAULT_SIZE];
   }
   public void add(T num){
       if(isFull()){
           resize();
       }
       items[size++]=num;
   }
   public boolean isFull(){
       return size==items.length;
   }
   public void resize(){
       T[] temp = (T[]) new Object[items.length*2];
       for(int i=0;i< items.length*2;i++){
           temp[i]=items[i];

       }
       items=temp;
   }
   public void change(int index,T num){
       items[index]=num;
   }
   public T getitem(int index){
       return items[index];
   }
   public int size(){
       return size;
   }
   public T remove(){
      return items[size--];

   }

    @Override
    public String toString() {
        return "OurGenericList{" +
                "items=" + Arrays.toString(items) +
                '}';
    }


    @Override
    public Iterator<T> iterator() {
       return new OurGenericListIterator(this);

    }
    private class OurGenericListIterator implements Iterator<T>{
       private OurGenericList<T> list;
       int index=0;
       OurGenericListIterator(OurGenericList<T> list){
           this.list=list;
       }

        @Override
        public boolean hasNext() {
            System.out.println("i am executing has next");
            return index<list.size;
        }

        @Override
        public T next() {
            System.out.println("i am executing next");
            return list.items[index++];
        }
    }
}
