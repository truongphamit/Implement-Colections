package com.truong.linkedlist;

public class Main {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.set(0, "X");
		// System.out.println(list.indexOf("F"));
		System.out.println(list);
		System.out.println(list.size());

	}

}
