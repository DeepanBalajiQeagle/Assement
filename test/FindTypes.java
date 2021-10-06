package org.qeagle.test;

public class FindTypes {
public static void main(String[] args) {
	String test = "$$ Welcome to 2nd Class of Automation $$ ";
	int  letter = 0, space = 0, num = 0, specialChar = 0;
	for (int i = 0; i < test.length(); i++) {
		char ch = test.charAt(i);
		
		
		//System.out.println(ch);
		if (Character.isLetter(ch)) {
			System.out.println("The Letters of the Text:" + ch);
		} else if (Character.isDigit(ch)) {
			System.out.println("The Number of the Text:" + ch);
		} else if (Character.isSpaceChar(ch)) {
			System.out.println("The SpaceChar of the Text:" + ch);
		} else {
			System.err.println("These are the Special Character:"+ch);
		}
		
	}
}
}
