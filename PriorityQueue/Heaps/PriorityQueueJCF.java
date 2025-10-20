package PriorityQueue.Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueJCF {
    public static void main(String[] args) {

        //give in ascending order
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3); //O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(logn)
        }

        System.out.println();
        
        //give in descending order
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(3); //O(logn)
        pq1.add(4);
        pq1.add(1);
        pq1.add(7);

        while(!pq1.isEmpty()){
            System.out.println(pq1.peek()); //O(1)
            pq1.remove(); //O(logn)
        }

    }
}
