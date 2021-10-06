package org.qeagle.test;

public class CountofDigits {
public static void main(String[] args) {
	int number=123;
	int rem,qut,count = 0,rev;
	while(number>0) {
		rem=number%10;
		count++;
		number=number/10;
		
	}
	System.out.println(count);
}
}
