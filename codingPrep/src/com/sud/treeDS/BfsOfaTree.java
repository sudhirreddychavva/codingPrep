package com.sud.treeDS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BfsOfaTree {

    public void bfs(Node node){
        Map mp = new HashMap();

        bfsIImp(node,0,mp);


        int i = mp.size()-1;
        while (i > 0){
            System.out.print(mp.get(i));
            i--;
        }

    }

    private void bfsIImp(Node node , int level, Map<Integer, ArrayList> mp){

        if(node == null){
            return;
        }

        if (!mp.containsKey(level)){
           mp.put(level,new ArrayList());
        }

        mp.get(level).add(node.value);

        bfsIImp(node.left,level+1,mp);
        bfsIImp(node.right,level+1,mp);

    }


}
