package com.anand.chararray;

public class ReturnUppercaseCharactersintheArray {

	public static void main(String[] args) {
		String str ="Hello World";
		char[] arr=str.toCharArray();
		
		String s="";
		for(int i=0;i<arr.length;i++) {
			if(Character.isUpperCase(arr[i]))
				s=s+arr[i];
		}
		System.out.print("Upper : "+s);
	}

}
