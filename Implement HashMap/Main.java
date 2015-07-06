package com.truong.hashmap;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "truong");
		hashMap.put(2, "hoa");
		hashMap.put(17, "hong");
		System.out.println(hashMap.get(17));
	}

}
