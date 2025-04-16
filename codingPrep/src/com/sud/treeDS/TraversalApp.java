package com.sud.treeDS;

public class TraversalApp {
    public static void main(String[] args){

        BinaryTree bt = new BinaryTree();

        Node n = new Node(1);
        bt.root = n;
        n.left = new Node(2);
        n.left.left = new Node(4);
        n.left.right = new Node(5);
        n.right = new Node(3);
        n.right.left = new Node(6);
        n.right.right = new Node(7);

        BinaryTreeTraversal btt = new BinaryTreeTraversal();
        btt.postOrderTraversal(bt.root);

        PreOrderTraversalWithStack potws = new PreOrderTraversalWithStack();
        //potws.preOrderTWithStack(bt.root);


        PostOrderTraversalWithStack postOTWS = new PostOrderTraversalWithStack();
       // postOTWS.postOrderTWithStack(bt.root);
        //btt.preOrderTraversal(bt.root);

    }
}
