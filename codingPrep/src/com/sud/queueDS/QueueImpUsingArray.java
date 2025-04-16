package com.sud.queueDS;

public class QueueImpUsingArray {

    private int[] arr;
    private int maxArrSize,currArrSize;

    public QueueImpUsingArray() {
        arr = new int[5];
        maxArrSize = 5;
        currArrSize = 0;
    }

    public void enqueue(int element){
        if(currArrSize == arr.length){
            System.out.println("The Queue is full");
            return;
        }
        arr[currArrSize++] = element;
        System.out.println("Element is added sucessfully at size : " + currArrSize);
    }

    public int dequeue(){
        if(arr.length == 0) {
            System.out.println("The Queue is empty");
            return -1;
        }
        int frontElement = arr[0];
        currArrSize = currArrSize -1;
        for (int i = 0 ; i < currArrSize ;  i++){
            arr[i] = arr[i+1];
        }
        return frontElement;
    }

    public void displayTheArr(){
        for (int i = 0 ; i < currArrSize ;  i++){
            System.out.print(arr[i]+"    ");
        }
    }
}
