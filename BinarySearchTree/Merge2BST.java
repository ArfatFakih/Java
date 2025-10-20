package BinarySearchTree;

import java.util.*;

public class Merge2BST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static void inorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end){
        if(st > end){
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    public static Node mergeBST(Node root1, Node root2){
        //step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        inorder(root1, arr1);

        //step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        inorder(root2, arr2);

        //step 3 -merge
        int i=0, j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }

        //step 4 create balanced BST with sorted arr
        return createBST(finalArr, 0, finalArr.size()-1);
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /* 
                    2
                  /   \
                 1     4

                   BST1
        */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /* 
                    9
                  /   \
                 3     12

                   BST2
        */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);


        /* 
                    3
                  /   \
                 1     9
                  \   / \
                   2 4   12

                   BST2
        */

        //O(n+m) -> Linear
        Node root = mergeBST(root1, root2);
        preorder(root);
    }
}
