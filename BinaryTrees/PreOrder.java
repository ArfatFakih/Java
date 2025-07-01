package BinaryTrees;

public class PreOrder {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){ //O(n)
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }  

        //Preorder Traversal steps:- 
        //1) Root
        //2) left Subtree
        //3) right Subtree

        public static void preOrderTraversal(Node root){ //O(n)
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        //Inorder Traversal steps:- 
        //1) left Subtree
        //2) Root
        //3) right Subtree

        public static void inorderTraversal(Node root){
            if(root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }


        //Postorder Traversal steps:- 
        //1) left Subtree
        //2) right Subtree
        //3) Root

        public static void postorderTraversal(Node root){
            if(root == null) {
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        // int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // BinaryTree tree = new BinaryTree();

        //Preorder data

        // Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preOrderTraversal(root);


        //Inorder data

        // Node root = tree.buildTree(nodes);
        // tree.inorderTraversal(root);


        //Postorder data

        // Node root = tree.buildTree(nodes);
        // tree.postorderTraversal(root);
    }  
}
