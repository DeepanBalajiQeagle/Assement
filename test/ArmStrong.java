package org.qeagle.test;

public class ArmStrong {
	public static void main(String[] args) {
		int number = 123;
		int rem=0;
		int res=0;
		int temp=0;
		temp=number;
		while (number>0) {
			rem=number%10;
			res=res+(rem*rem*rem);
			number=number/10;
		}if (temp==res) {
			System.out.println("Its is an ArmStrong Number:"+res);
		}else {
			System.out.println("Its is not a ArmStrong Number:"+res);
		}
		
	}
}


	

