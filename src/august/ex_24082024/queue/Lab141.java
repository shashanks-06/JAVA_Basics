package august.ex_24082024.queue;

import java.util.PriorityQueue;

public class Lab141 {
    public static void main(String[] args) {
        //  QUEUE ->  Used less than 1%

        PriorityQueue pq = new PriorityQueue();
        pq.offer("1");      // offer = add
        pq.offer("4");
        pq.offer("2");
        pq.offer("3");

        System.out.println(pq);             // [1, 3, 2, 4]
        System.out.println(pq.peek());      // 1
        System.out.println(pq.poll());      // 1
        System.out.println(pq);             // [2, 3, 4]
        
    }
}
