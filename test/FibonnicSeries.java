package org.qeagle.test;

public class FibonnicSeries {
	public static void main(String[] args) {
		int range = 8;
		int firstNumber = 0;
		int secNum = 1, sum;
		//0+1=1
		System.out.println(firstNumber);
		for (int i =1; i <=range; i++) {
			sum = firstNumber + secNum;
			//System.err.println(sum);
			firstNumber=secNum;
			//System.err.println(secNum);
			secNum=sum;
			System.out.println(sum);
		}

	}
}
