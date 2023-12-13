package com.anand.chararray;

public class ASCII {

    public static void main(String[] args) {
    	String str = "Hello World"; 
		char[] arr = str.toCharArray();
		
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" "+(int)arr[i]);
        }
    }
}

