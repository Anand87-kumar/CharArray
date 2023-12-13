package com.anand.chararray;

public class ChangeCaseOfCharacterInArray {

	public static void main(String[] args) {
		String str="Hello World";
		char[] arr=str.toCharArray();
		
		String s="";
		for(int i=0;i<arr.length;i++) {
			if(Character.isUpperCase(arr[i]))
				s+=Character.toLowerCase(arr[i]);
			else
				s+=Character.toUpperCase(arr[i]);
		}
		System.out.print(s);
	}

}
