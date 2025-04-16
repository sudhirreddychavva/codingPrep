package com.sud.queueDS;

import java.net.StandardSocketOptions;

public class QueueImpApp {

    public static void main (String[]  args) {
        QueueImpUsingArray qiuarray = new QueueImpUsingArray();
        qiuarray.enqueue(1);
        qiuarray.enqueue(2);
        qiuarray.enqueue(3);
        qiuarray.enqueue(4);
        qiuarray.enqueue(5);

        qiuarray.enqueue(6);

        System.out.println(qiuarray.dequeue());

        qiuarray.displayTheArr();


    }
}
