package Generics;


import java.util.Arrays;
//wild card is something which actually does not have any restriction and by denoted using ?
//? extends Number you can use the number as well it's subclass
public class Wildcards<T>{//bounded parameters,which actually restrict what type of parameter it may  have
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public Wildcards() {
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object[] temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
   public T remove(){
        T  removed=(T)(data[size--]);
        return removed;
    }
    public int size(){
        return size;
    }
    public T get(int index){
        T value=(T)(data[index]);
        return value;
    }
    public void set(int index,T value){
        data[index]=value;
    }



    public static void main(String[] args) {
        Wildcards list = new Wildcards();
        list.add(55);
        System.out.println(list);
        list.set(5,77777);
        System.out.println(list);
    }


    @Override
    public String toString() {
        return "customArraylist1{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}

