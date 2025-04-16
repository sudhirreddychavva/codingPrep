package com.sud.treeDS;

public class MergeBSTsApp {

    public static void main(String[] args){

        Node n = new Node(10);
        BinaryTree bst1 = new BinaryTree();
        bst1.root = n;
        n.left = new Node(8);
        n.left.left = new Node(7);
        n.left.right = new Node(9);

        n.right = new Node(12);
        n.right.left = new Node(11);
        n.right.right = new Node(13);


        Node n1 = new Node(10);
        BinaryTree bst2 = new BinaryTree();
        bst2.root = n1;
        n1.left = new Node(5);
        n1.left.left = new Node(4);
        n1.left.right = new Node(8);

        n1.right = new Node(15);
        n1.right.left = new Node(12);
        n1.right.right = new Node(16);


        MergeBSTs mbst = new MergeBSTs(null);
        mbst.mergeBSTs(bst1,bst2);




    }
}
