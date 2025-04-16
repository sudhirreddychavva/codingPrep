package com.sud.treeDS;

import java.util.ArrayList;

public class BuildTreeFromPostOrderNdInOrderApp {

    public static void main(String[] args){

        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);

        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);


        bt.root.left.left.left = new Node(8);


        bt.root.left.right.left = new Node(9);
        bt.root.left.right.right = new Node(10);

        bt.root.right.right.left = new Node(11);
        bt.root.right.right.right = new Node(12);

        bt.root.right.right.right.right = new Node(13);


        BinaryTreeTraversal btt = new BinaryTreeTraversal();
        //btt.preOrderTraversal(bt.root);
        //btt.inOrderTraversal(bt.root);
        //btt.postOrderTraversal(bt.root);

        BuildTreeFromPostOrderNdInOrder btfpndin = new BuildTreeFromPostOrderNdInOrder();
        ArrayList<Integer> inorderArray = new ArrayList();
        btfpndin.inOrderTraversalUsingStack(bt.root,inorderArray);

        /*for (Integer i : inorderArray){
            System.out.print(i+ "  ");
        }*/

        /*inorderArray.stream().forEach(i -> {
            System.out.print(i+ " ");
        });*/

        System.out.println("");
        ArrayList<Integer> postOrderArray = new ArrayList();
        btfpndin.postOrderTraversalUsingRecur(bt.root,postOrderArray);

        for (Integer i : inorderArray){
            System.out.print(i+ "  ");
        }

        /*postOrderArray.stream().forEach(i -> {
            System.out.print(i+ " ");
        });*/

        System.out.println("");

        Node n = btfpndin.buildTreeFromInorderNdPostOrder(inorderArray,postOrderArray);

        btt.preOrderTraversal(n);


    }


}
