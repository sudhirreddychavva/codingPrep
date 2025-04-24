package com.sud.InterviewQ;

import java.util.HashMap;

public class LRUCacheImp {

    public static void main(String[] args) {

        LruCache lruCache = new LruCache(2);
        lruCache.put(10);
        lruCache.put(20);

        System.out.println(lruCache.get(10).data);
        lruCache.put(30);

        System.out.println(lruCache.get(20).data);

        lruCache.put(40);
        System.out.println(lruCache.get(30).data);

    }

}

    class Node {
        int data;
        Node next;
        Node prv;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prv  = null;
        }
    }

    class LruCache {
        int capacity;
        HashMap<Integer,Node> nodeCache;
        Node head;
        Node tail;


        public LruCache(int capacity) {
            this.capacity = capacity;
            nodeCache = new HashMap<>();
            this.head = new Node(-1);
            this.tail = new Node(-1);
            this.head.next = this.tail;
            this.tail.prv = this.head;
        }


        public void put (int data){

            if (this.nodeCache.containsKey(data)){
                Node node = this.nodeCache.get(data);
                remove(node);
            }
            Node node = new Node(data);
            this.nodeCache.put(data,node);
            add(node);

            if (nodeCache.size() > capacity){
                Node removeLastnode = this.tail.prv;
                nodeCache.remove(removeLastnode.data);
                remove(removeLastnode);
            }

        }

        public void add (Node node){
            Node headNxtNode = head.next;
            node.next = headNxtNode;
            headNxtNode.prv = node;
            head.next = node;
            node.prv = head;
        }

        public void remove (Node node){
            Node prvNode = node.prv;
            Node nextNode = node.next;
            prvNode.next = nextNode;
            nextNode.prv = prvNode;
        }

        public Node get(int data){

            if (!nodeCache.containsKey(data)){
                return new Node(-1);
            }

            Node node = nodeCache.get(data);
            remove(node);
            add(node);
            return node;
        }
    }



