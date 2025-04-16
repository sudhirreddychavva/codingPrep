package com.sud.treeDS;

import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversalWithStack {

    public void preOrderTWithStack(Node node){

        if (node == null){
            return;
        }

        Stack s = new Stack();
        ArrayList<Integer> i = new ArrayList<>();

        Node curr = node;

        while (curr != null || !s.isEmpty()){
            while (curr != null){
                i.add(curr.value);
                s.push(curr);
                curr = curr.left;
            }

            curr = (Node) s.pop();
            curr = curr.right;

        }


        for (Integer k : i){
            System.out.println(k);
        }


    }

}
