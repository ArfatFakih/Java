package PriorityQueue.Heaps;

import java.util.*;

public class HeapImplementation {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { //O(logn)
            //add at last idx
            arr.add(data);

            int x = arr.size()-1; //x is child index
            int par = (x-1)/2; //par index

            while(arr.get(x) < arr.get(par)) { 
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int midIdx = i;

            if(left < arr.size() && arr.get(midIdx) > arr.get(left)){
                midIdx = left;
            }

            if(right < arr.size() && arr.get(midIdx) > arr.get(right)){
                midIdx = right;
            }

            if(midIdx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(midIdx));
                arr.set(midIdx, temp);

                heapify(midIdx);
            }
        }
        public int remove() {
            int data = arr.get(0);

            //step1 - swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2 - delete last
            arr.remove(arr.size()-1);

            //step3 - heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
