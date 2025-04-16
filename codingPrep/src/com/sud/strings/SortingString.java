package com.sud.strings;

public class SortingString {

    public static void main (String[] args){
        sortString("16539");
    }

    public static void sortString(String s){

       char[] arr = s.toCharArray();

       System.out.println(arr[0]+"  "+arr[1]);


      for (int i = 0 ; i < arr.length-1 ; i++){
          for (int j = i+1; j < arr.length-1;j++){
              if(arr[i] > arr[j]){
                  char temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
      }

      for (char c : arr){
          System.out.print(c+ "  ");
      }


    }
}
