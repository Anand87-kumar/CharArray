package com.anand.chararray;

public class PrintOnlyDigits {

	public static void main(String[] args) {
		String str="Hello24 World34";
		char[] arr=str.toCharArray();
		
		String s="";
		for(int i=0;i<arr.length;i++) {
			if(Character.isDigit(arr[i]))
				s=s+arr[i];
		}
		System.out.print("Return with only Digit : "+s);
	}

}
