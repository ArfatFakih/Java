package BinaryTrees;

public class DiameterOfATree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }

        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int diameter(Node root){ //O(n^2)
        if(root == null){
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHt = heightOfTree(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = heightOfTree(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }


    //Approach - 2 - optimized

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root){ //O(n)
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rigtInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rigtInfo.diam), leftInfo.ht + rigtInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rigtInfo.ht) + 1;

        return new Info(diam, ht);
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


        //Approach 1 data

        // System.out.println(diameter(root));


        //Approach 2 data
        System.out.println(diameter2(root).diam);
        System.out.println(diameter2(root).ht);
    }
}
