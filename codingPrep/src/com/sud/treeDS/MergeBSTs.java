package com.sud.treeDS;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeBSTs {

    private BinaryTreeTraversal btt;
    public static Integer i = 0;

    public MergeBSTs(BinaryTreeTraversal btt) {
        this.btt = btt;
    }


    public void mergeBSTs(BinaryTree b1 , BinaryTree b2){

        ArrayList a1 = new ArrayList();
        inOrderTraversal(b1.root,a1);
        BinaryTreeTraversal.i = 0;
        System.out.println("");
        ArrayList a2 = new ArrayList();
        i = 0;
        inOrderTraversal(b2.root,a2);

        System.out.println("A1 array : "+ a1);

        System.out.println("A2 array : "+ a2);


        ArrayList a3 = new ArrayList();
        a3.addAll(a1);
        a3.addAll(a2);


        System.out.println("A3 Array :" + a3.stream().sorted());

    }


    public void inOrderTraversal(Node root, ArrayList array){

        if (root == null)
            return;
        inOrderTraversal(root.left,array);
        if(i == 0){
            System.out.print(root.value);
            array.add(root.value);
            i = i+1;
        }
        else {
            System.out.print(" ---> " + root.value);
            array.add(root.value);
        }
        inOrderTraversal(root.right,array);


    }
}
