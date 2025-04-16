package com.sud.treeDS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalTraversalOfTree {

    public ArrayList verticalTraversalUsingMap(Node node){

        ArrayList<ArrayList> res = new ArrayList<>();

        Map<Integer,ArrayList<Integer>> mp = new HashMap<>();
        int[] mhd = {0};

        dfs(node,0,mhd,mp);

        int hd = mhd[0];

        while (mp.containsKey(hd)){
            res.add(mp.get(hd));
            hd--;
        }


        return res;
    }


    private void dfs (Node node, int hd, int[] mhd, Map<Integer, ArrayList<Integer>> mp ){

        if(node == null)
            return;

        if(!mp.containsKey(hd)){
            mp.put(hd,new ArrayList<Integer>());
        }

        mp.get(hd).add(node.value);

        mhd[0] = Math.max(mhd[0],hd);

        dfs(node.left,hd - 1 , mhd,mp);
        dfs(node.right,hd + 1 ,mhd,mp);
    }


}
