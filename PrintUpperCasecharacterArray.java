package com.anand.chararray;

public class PrintUpperCasecharacterArray {

	public static void main(String[] args) {
		String[] arr={"NO26","Sound"};
		
		for(String str:arr) {
			for(int i=0;i<arr.length;i++) {
				char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) 
				System.out.println(ch);
			
		}

	}

}
}