package com.sud.treeDS;

import javax.xml.transform.stream.StreamSource;

public class BinaryTreeTraversal {
    public static Integer i = 0;

    public void inOrderTraversal(Node root){

        if (root == null)
           return;
        inOrderTraversal(root.left);
        if(i == 0){
            System.out.print(root.value);
            i = i+1;
        }
        else {
            System.out.print(" ---> " + root.value);
        }
        inOrderTraversal(root.right);


    }

    public void preOrderTraversal(Node root){

        if (root == null)
            return;
        if(i == 0){
            System.out.print(root.value);
            i = i+1;
        }
        else {
            System.out.print(" ---> " + root.value);
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);



    }

    public void postOrderTraversal(Node root){

        if (root == null)
            return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);

        if(i == 0){
            System.out.print(root.value);
            i = i+1;
        }
        else {
            System.out.print(" ---> " + root.value);
        }

    }

    public static Integer getI() {
        return i;
    }

    public static void setI(Integer i) {
        BinaryTreeTraversal.i = i;
    }
}
