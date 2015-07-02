package com.truong.implement;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList<>();
		
		list.add("truong0");
		list.add("truong1");
		list.add("truong2");
		System.out.println(list.get(1));
	}

}
