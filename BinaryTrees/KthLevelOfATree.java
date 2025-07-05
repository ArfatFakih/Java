package BinaryTrees;

import java.util.*;

public class KthLevelOfATree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kthlevel(Node root, int level, int k){ //O(n)
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data + " ");
            return;
        }

        kthlevel(root.left, level+1, k);
        kthlevel(root.right, level+1, k);
    }

    public static void kthlevel2(Node root, int k){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 1;

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    level++;
                }
            }else {
                if(level == k){
                    res.add(curr.data);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }

        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i)+ " ");
        }
    }

    public static void main(String[] args) { 
        /* 
                    1
                  /   \
                 2     3
                / \   / \
               4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;

        // kthlevel(root, 1, k);

        kthlevel2(root, k);

    }
}
