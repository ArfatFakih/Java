package LinkedLists;

import java.util.LinkedList; // Java Collections Framework

public class LinkedListCollections {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
