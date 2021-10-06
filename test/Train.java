package org.qeagle.test;

public class Train {
	private int screenSize;
	private int display;
	private String phoneName;

	public void makeCalls(String name, long number) {
		System.out.println("Name of the Phone:" + name);
		System.out.println("Phone Number:" + number);
	}

	public void display(int size) {
		System.out.println("Width of the Phone:" + size);
	}

	public long phoneNumber() {
		long number = 123445678987L;
		return number;
	}

	public static void main(String[] args) {
		Train tr = new Train();
		tr.screenSize = 12;
		int size = tr.display = 24;
		String name = tr.phoneName = "Motog5";
		tr.display(size);
		long number = tr.phoneNumber();
		tr.makeCalls(name, number);

	}
}
