package Collections;

import java.util.*;

public class Example{


    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(33);
//        list.add(3);
//        list.add(43);
//        //if you are getting a question in leetcode like you should return in an array
//        //you should do like
////        Integer[] arr =list.toArray(new Integer[0]);
////        for(int x:arr){
////            System.out.println(x+",");
////        }
//      //  System.out.println(list);
//       // list.set(2,555);
//      //  System.out.println(list);
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(3333);
//        list2.addAll(list);
//
//        //list2.subList()
//
//
//       // System.out.println(list2);
//
//        LinkedList<Integer> lk = new LinkedList<>();
//        lk.add(55);
//        lk.add(44);
//        lk.add(77);
//        //[55,44,77]
//       ListIterator<Integer> iterator =lk.listIterator();
////        System.out.println(iterator.next());
////        System.out.println(iterator.next());
////        System.out.println(iterator.previous());//internally it was something like return item[--index]
////       FIFO queue
//        Deque<Integer> queue = new LinkedList<>();
//        //for out convention always use arraydeque for deque(double ended queues)
//        //linkedlist for queue
//        queue.push(3);
//        queue.offerLast(66);
//       // System.out.println(queue);
//        //queue.pollLast();
////       System.out.println(queue.peekFirst());
////        System.out.println(queue);
//        //System.out.println(queue);
//
//        //queue.poll();
//      //  System.out.println(queue.peek());
//        Stack<Integer> stack=new Stack<>();
//        stack.push(2);
//        stack.push(3);
//
////            System.out.println(stack);
////            System.out.println(stack.peek());
////            System.out.println( stack.pop());
////            System.out.println(stack);
        PriorityQueue<Integer> pq = new PriorityQueue<>();//1.47 watch for lambda
//        pq.offer(100);
//        pq.offer(2);
//        pq.offer(35);
//        pq.offer(41);
//        pq.offer(444);
//        System.out.println(pq);
        //instead of top2 I am getting bottom because of compareTo which is inside in the Integer
        List<Integer> top2 = new ArrayList<>();
        int index=0;
        while(!pq.isEmpty()){
            if(index==3)
                break;
            top2.add(pq.poll());
            index++;
        }
        //System.out.println(top2);

//        //if you want to get the bottom 3 elements
//        List<Integer> bottom3 = new ArrayList<>();
//      //  System.out.println(pq.size());
//        int size=pq.size();
//        while(!pq.isEmpty()){
//            if(size<0) {
//                break;
//            }
//            bottom3.add(pq.poll());
//            --size;
            // System.out.println(bottom3);
            List<StudentMarks> stmarks = new ArrayList<>();
            stmarks.add(new StudentMarks(44,66));
            stmarks.add(new StudentMarks(88,61));
            stmarks.add(new StudentMarks(94,69));
            stmarks.add(new StudentMarks(49,96));
            stmarks.add(new StudentMarks(94,90));

//            PriorityQueue<StudentMarks> spq = new PriorityQueue<>(new MyCustomComparator());
//            spq.offer(new StudentMarks(44,66));
//            spq.offer(new StudentMarks(44,33));
//            spq.offer(new StudentMarks(55,88));
//            spq.offer(new StudentMarks(99,98));
//
//
//            List<StudentMarks> listof2 = new ArrayList<>();
//            int sizu =0;
//            while(!spq.isEmpty()){
//                if(sizu==3)
//                    break;
//                listof2.add(spq.poll());
//                sizu++;
//            }
           // System.out.println(listof2);
//        Set<StudentMarks> set = new HashSet<>();
//        set.add(new StudentMarks(44,66));
//        System.out.println(set);
//        System.out.println(set.contains(new StudentMarks(44,66)));
//        NavigableSet<Integer> set = new TreeSet<>();
////        set.add(8);
////        set.add(10);
////        set.add(3000);
////        set.add(1);
////
////        System.out.println(set.removeFirst());
        Map<String,Integer> map = new HashMap<>();
        map.put("maxwell",77);
        map.put("warner",66);
        map.put("smith",99);
        map.put(null,44);
        System.out.println(map);
        if(map.containsValue(66)){
            System.out.println("exist");
        }else {
            System.out.println("not exist");
        }
        //get value by key
        System.out.println(map.get("maxwell"));
        //if you want to have the set of keys in map
       Set<String> keys= map.keySet();
        System.out.println(keys);
        //if you want to print the value
       Collection<Integer> values= map.values();
        System.out.println(values);
        //if you want to print the keys and values //if you want to iterate over a hashmap
       //for each method
        for(Map.Entry<String,Integer> each : map.entrySet()){
            System.out.println(each.getKey()+each.getValue());
        }

       //by using an iterator
      Set<Map.Entry<String,Integer>> iterator= map.entrySet();
      Iterator<Map.Entry<String,Integer>> entryIterator=iterator.iterator();
      while (entryIterator.hasNext()){
          Map.Entry<String,Integer> entry = entryIterator.next();
          System.out.println(entry.getKey()+entry.getValue());
      }













        }


}


