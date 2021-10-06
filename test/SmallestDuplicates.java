package org.qeagle.test;

public class SmallestDuplicates {
public static void main(String[] args) {
	int count;
	int[] arr ={2,5,3,7,2,7,2,1};
	for (int i = 0; i < arr.length; i++) {
		count=0;
		for (int j = i+1; j < arr.length; j++) {
			count=count+1;
			if(arr[i]==arr[j]) {
				int min = Math.min(arr[i], count);
				System.out.print(min);
				}
			
			
		}
		
		
	}
}
}
