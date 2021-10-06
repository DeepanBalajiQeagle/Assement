package org.qeagle.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	List<Integer> li= new ArrayList<Integer>();
	li.add(1);
	li.add(2);
	li.add(2);
	li.add(3);
	li.add(4);
	li.add(4);
	li.add(5);
	Set<Integer> sd=new HashSet<Integer>(li);
	for (Integer integer : sd) {
		System.out.println(integer);
	}
}
}
