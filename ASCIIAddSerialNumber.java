package com.anand.chararray;

public class ASCIIAddSerialNumber {

	public static void main(String[] args) {
		String arr="No26 Sound";
		
		for(int i=0;i<arr.length();i++) {
			char ch =arr.charAt(i);
			int asciValue=(int)ch;
			System.out.println((i+1)+"."+"ch"+" "+asciValue);
		}

	}

}
