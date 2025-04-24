package com.sud.InterviewQ;

public class ReverseLinekedList {

    public static void main(String[] args){
        Node n = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);

        n.next = n1;
        n1.next = n2;
        n2.next = n3;

        LinkedList l = new LinkedList();
        l.head = n;

        l.print(l.head);

        l.reverseLk(l.head);

    }

}

class Nodes {
    int data;
    Node next;

    public Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;


    public void print (Node node) {
        while (node != null){
            System.out.print("  "+node.data);
            node = node.next;
        }
    }

    public void reverseLk(Node node){
        Node curr = node ; Node next = null; Node prv = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prv;
            prv = curr;
            curr = next;
        }
        System.out.println();
        print(prv);
    }
}