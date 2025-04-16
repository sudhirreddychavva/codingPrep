package com.sud.treeDS;

import java.util.*;
import java.util.stream.Collectors;

public class BuildTreeFromPostOrderNdInOrder {


    private Node buildTreeFromInNdPost(ArrayList<Integer> inOrderArray, ArrayList<Integer> postOrderArray, int start, int end, int[] postOrderArrayLastIndex, Map<Integer,Integer> inOrderVlaueIndexMap){

        if (start > end){
            return null;
        }

        Integer curr = postOrderArray.get(postOrderArrayLastIndex[0]);
        Node node = new Node(curr);
        postOrderArrayLastIndex[0]--;

        if (start == end)
            return  node;

        Integer index = inOrderVlaueIndexMap.get(curr);

        node.right = buildTreeFromInNdPost(inOrderArray,postOrderArray,index+1,end,postOrderArrayLastIndex,inOrderVlaueIndexMap);
        node.left = buildTreeFromInNdPost(inOrderArray,postOrderArray,start,index-1,postOrderArrayLastIndex,inOrderVlaueIndexMap);

        return node;

    }

    public Node buildTreeFromInorderNdPostOrder(ArrayList<Integer> inOrderArray1, ArrayList<Integer> postOrderArray){
            int len = inOrderArray1.size();

            Map<Integer,Integer> inOrderArrayVlaueNdIndMap = new HashMap<>();
            //inOrderArray.stream().collect(Collectors.toMap(Integer.getInteg));
            int counter = 0;
            for(int i=0;i < len;i++) {
               System.out.println(inOrderArray1.get(i)+ "  ::  " + i);
                inOrderArrayVlaueNdIndMap.put(inOrderArray1.get(i),i);

            }

            System.out.println(inOrderArrayVlaueNdIndMap);
            /*for (Map.Entry<Integer,Integer> m : inOrderArrayVlaueNdIndMap.entrySet()){
                System.out.println(m.getValue());
            }*/

            int[] postIndex = new int[]{len - 1};

            System.out.println(len+ " len");
            Node node = buildTreeFromInNdPost(inOrderArray1,postOrderArray,0,len-1,postIndex,inOrderArrayVlaueNdIndMap);
            return node;
    }


    public void inOrderTraversalUsingStack(Node node, ArrayList<Integer> inrorderArry){
        Stack inorderStack = new Stack();
        Node curr = node;
        while (curr != null || !inorderStack.isEmpty()){

            while (curr != null){
                inorderStack.push(curr);
                curr = curr.left;
            }

            curr = (Node) inorderStack.pop();
            inrorderArry.add(curr.value);
            curr = curr.right;
        }
    }

    public void postOrderTraversalUsingRecur(Node root,ArrayList<Integer> postOrderArray){

        if (root == null)
            return;

        postOrderTraversalUsingRecur(root.left,postOrderArray);
        postOrderTraversalUsingRecur(root.right,postOrderArray);

        postOrderArray.add(root.value);

    }

}
