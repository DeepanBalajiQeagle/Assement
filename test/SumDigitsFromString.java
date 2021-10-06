package org.qeagle.test;

public class SumDigitsFromString {
public static void main(String[] args) {
	String text = "Tes12Le79af65";
	int sum = 0;
	String replace = text.replace("/[^0-9]/g", " ");
	char[] ch = replace.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		int value = Character.getNumericValue(ch[i]);
		sum=sum+value;
		}
	System.out.println(sum);
}
}
