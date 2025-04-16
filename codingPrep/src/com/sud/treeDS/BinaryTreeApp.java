package com.sud.treeDS;

public class BinaryTreeApp {

    public static void main (String[] args){
        Node n = new Node(10);
        BinaryTree b = new BinaryTree();
        b.root = n;

        n.left = new Node(8);
        n.right = new Node(15);

        n.left.left = new Node(4);
        n.left.right = new Node(9);

        n.right.left = new Node(13);
        n.right.right = new Node(16);

        //b.printTree(b.root);


        BinaryTreeTraversal btt = new BinaryTreeTraversal();
        System.out.println("\n InOrder Traversal :");
        btt.inOrderTraversal(b.root);
        System.out.println("\n PreOrder Traversal :");
        BinaryTreeTraversal.i = 0;
        btt.preOrderTraversal(b.root);

        System.out.println("\n PostOrder Traversal :");
        BinaryTreeTraversal.i = 0;
        btt.postOrderTraversal(b.root);

    }
}
