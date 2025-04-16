package com.sud.treeDS;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversalWithStack {

    public void postOrderTWithStack(Node node){

        if (node == null){
            return;
        }

        Stack s = new Stack();
        ArrayList<Integer> i = new ArrayList<>();

        Node curr = node;

        while (curr != null || !s.isEmpty()){
            while (curr != null){
                curr = curr.left;
            }
            i.add(curr.value);
            curr = curr.right;



        }


        for (Integer k : i){
            System.out.println(k);
        }


    }

}
