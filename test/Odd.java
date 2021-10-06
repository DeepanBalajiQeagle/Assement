package org.qeagle.test;

public class Odd {
public static void main(String[] args) {
	for (int i = 1; i <=20; i++) {
		if (i%2==1) {
			System.out.println("This is Odd Number:"+i);
		}else {
			System.err.println("This Even Number:"+i);
		}
	}
}
}
