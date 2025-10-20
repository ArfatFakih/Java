package QueueDSA;

import java.util.*;

public class ReverseFirstKElements {

    //Code using Stack - O(n)

    public static void reverseQueueFirstKElementsUsingStack(Queue<Integer> queue, int k){

        if(queue.isEmpty() == true || k > queue.size()){
            return;
        } 

        if(k <= 0){
            return;
        }

        Stack<Integer> s = new Stack<>();

        for(int i=0; i<k; i++){
            s.push(queue.peek());
            queue.remove();
        }

        while(!s.isEmpty()){
            queue.add(s.peek());
            s.pop();
        }

        int size = queue.size() - k;

        for(int i=0; i<size; i++){
            queue.add(queue.peek());
            queue.remove();
        }
    }


    //Code using Recursion - O(n)

    // public static void reverseQueueFirstKElementsUsingRecursion(Queue<Integer> queue, int k){
    //     helper(queue, k);
    //     int sz = queue.size() - k;
    //     while(sz -- > 0){
    //         int x = queue.poll(); // same as queue.remove()
    //         queue.add(x);
    //     }
    // }

    // public static void helper(Queue<Integer> queue, int k){
    //     if(k == 0){
    //         return;
    //     }
    //     int front = queue.poll();
    //     helper(queue, k-1);
    //     queue.add(front);
    // }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        int k = 5;
        reverseQueueFirstKElementsUsingStack(queue,k);
        // reverseQueueFirstKElementsUsingRecursion(queue,k);

        while(!queue.isEmpty()){
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
}
