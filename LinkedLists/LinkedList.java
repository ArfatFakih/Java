package LinkedLists;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Time complexity = O(1)
    public void addFirst(int data) {
        //Step 1 = create new node
        Node newNode = new Node(data);
        size++;

        //step 2 = If list is empty 
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        //step 2 = If list is not empty
        newNode.next = head;

        //step 3 
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while(i < idx - 1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size - 2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void reverseLinkedList(){ //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void deleteNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //slow-fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow; //slow is the midNode
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null){
            return true;
        }

        //step-1 find mid
        Node midNode = findMid(head);

        //step-2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head;

        //step-3  check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean isCycle(){ //Floyd's Cycle Finding algorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; //cycle or loop exists
            }
        }

        return false; //cycle or loop doesn't exists
    }

    public static void removeCycle(){
        //Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting point 
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }  

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; //mid node
    }

    public Node mergeSort(Node head){ //O(nlogn)
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public void zigZag() {
        //step1 - Find Mid 
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        //step2 - Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step3 - merge - zig-zag merge
        Node left = head;
        Node right = prev;
        Node nextLeft, nextRight;

        while(left != null && right != null){
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }

    }

    //Delete N Nodes After M Nodes of a Linked List
    Node ogHead;
    Node ogTail;

    public void addLastmNodes(Node curr){
        ogTail.next = curr;
        ogTail = curr;
    }

    public Node addNodes(Node curr, int m){
        while(curr != null && m>0){
            Node currKaNext = curr.next;
            curr.next = null;

            addLastmNodes(curr);
            curr = currKaNext;
            m--;
        }
        return curr;
    }

    public Node deletnNodesAftermNodes(Node head, int m, int n){
        Node dummy = new Node(-1);
        ogHead = dummy;
        ogTail = dummy;
        
        Node curr = head;
        int N = n;

        while(curr != null){
            curr = addNodes(curr, m);

            //delete n nodes
            while(curr != null && N>0){
                curr = curr.next;
                N--;
            }
            N=n;
        }
        return dummy.next;
    }

    public void print(){ //O(n)
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
        }

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.reverseLinkedList();
        // ll.deleteNthFromEnd(3);
        // ll.print();


        //data to check palindrome 

        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.print();
        // System.out.println(ll.checkPalindrome());

        //Data to check is cycle or loop is there or not in Linked List
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        // // 1->2->3->1
        // System.out.println(isCycle());
        

        //Data to remove cycle from Linked list code
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // // 1->2->3->2

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());


        //Data for merge sort on Linked List
        // LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(6);
        // ll.addFirst(8);
        // ll.addFirst(5);
        
        // ll.print();

        // ll.head = ll.mergeSort(ll.head);
        // ll.print();

        //Data for zig-zag Linked List
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        //1->2->3->4->5->6

        ll.print();
        ll.zigZag();
        ll.print();
    }
}
