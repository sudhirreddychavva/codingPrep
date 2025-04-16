package com.sud.treeDS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class BuildTreeFromPreOrderNdInOrder {


    private Node buildTreeStuc(ArrayList inOrderArry, ArrayList preOrder, int start, int end, Map inorderMap,int[] preIndex) {

        if (start > end) {
            return null;
        }

        int value = (int) preOrder.get(preIndex[0]);

        Node root = new Node(value);
        preIndex[0]++;

        int index = (int) inorderMap.get(value);

        root.left  = buildTreeStuc(inOrderArry, preOrder, start, index - 1, inorderMap, preIndex);
        root.right = buildTreeStuc(inOrderArry, preOrder, index + 1, end, inorderMap, preIndex);

        return root;
    }

    public Node buildBinaryTreeFromInorderNdPreOrd(ArrayList inOrderArry, ArrayList preOrder){

        Map inorderIndexMap = new HashMap();
        inorderIndexMap = (Map) inOrderArry.stream().collect(Collectors.toMap(i -> i , k -> inOrderArry.indexOf(k)));

        int[] preOrderIndex = {0};
        int end = inOrderArry.size()-1;
        return buildTreeStuc(inOrderArry,preOrder,0,end,inorderIndexMap,preOrderIndex);
    }

    public void preOrderTraversalUsingStack(Node node, ArrayList<Integer> prerorderArry){
        Stack preOrderStack = new Stack();
        Node curr = node;
        while (curr != null || !preOrderStack.isEmpty()){
            while (curr != null){
                preOrderStack.push(curr);
                prerorderArry.add(curr.value);
                curr = curr.left;
            }
            curr = (Node) preOrderStack.pop();
            curr = curr.right;
        }
    }


}
