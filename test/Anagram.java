package org.qeagle.test;

import java.util.Arrays;
import java.util.Iterator;

public class Anagram {
	public static void main(String[] args) {
		String[] text1 = { "stops" };
		String[] text2 = { "potss" };
		int l1 = text1.length;
		int l2 = text2.length;
		if (l1 != l2) {
			Arrays.sort(text1);
			Arrays.sort(text2);
			for (int i = 0; i < l1; i++) {
				if (text1[i] != text2[i]) {
                        System.out.println("It is an anagram");
				}else {
					System.out.println("It is not an Anagram");
				}
			}
		}
	}
}
