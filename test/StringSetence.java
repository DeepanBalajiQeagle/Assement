package org.qeagle.test;

public class StringSetence {
public static void main(String[] args) {
	String sc = "I am working with Java8";
     String replace = sc.replace("8", "11");
     System.out.println("The value after replacing:"+replace);
     String substring = replace.substring(5, 14);
     System.out.println("The value after substring:"+substring);
     
}
}
