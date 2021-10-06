package org.qeagle.train;

import java.util.Scanner;

public class FirstDay {
public void name(int a) {
	System.out.println("Welcome to first day training");
}

public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER THE NAME");
	String name=sc.nextLine();
	System.out.println(name);
	
	FirstDay fd= new FirstDay();
	fd.name(5);
}
}
