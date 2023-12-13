package com.anand.chararray;

public class PrintOnlyLowerCase {

	public static void main(String[] args) {
		
		String str = "Hello World"; 
		char[] arr = str.toCharArray();
		
			for(int i=0;i<arr.length;i++) {
				if(Character.isLowerCase(arr[i]))
					System.out.print(arr[i]);
			}
		}

	}


