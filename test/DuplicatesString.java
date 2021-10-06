package org.qeagle.test;

import java.util.Iterator;

public class DuplicatesString {
	public static void main(String[] args) {
		int count;
		String text = "We learn java basics as part of java sessions in java week1";
		String lc = text.toLowerCase();
		String[] sc = lc.split(" ");
		for (int i = 0; i < sc.length; i++) {
			count=0;
			//System.out.println(sc[i]);
			for (int j = i+1; j < sc.length; j++) {
				//System.err.println(sc[j]);
				if (sc[i].equals(sc[j])) {
					System.out.println(sc[i]);
				}
			}
		}
		}

	}


