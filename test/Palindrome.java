package org.qeagle.test;

import java.util.Iterator;

public class Palindrome {
	public static void main(String[] args) {
		String word="madam";
		String rev=" ";
		for (int i = word.length()-1; i>=0; i--) {
			char ch = word.charAt(i);
			rev=rev+ch;
			//System.err.println(word.equals(rev));
		}
		if (word.contains(rev)) {
			System.out.println("Its is Palindrome String");
		}else {
			System.out.println("Its is not a plaidrome ");
		}
		
	}
}
