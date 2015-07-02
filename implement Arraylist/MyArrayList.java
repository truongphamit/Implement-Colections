package com.truong.implement;

import java.util.Arrays;

public class MyArrayList<T> {
	private int size = 0;
	private int defaultSize = 8;
	private T[] values = (T[])new Object[defaultSize];
	
	public int size() {
		return size;
	}
	
	public T get(int index) throws IndexOutOfBoundsException{
		T t = null;
		if (index > size - 1) {
			throw new IndexOutOfBoundsException();
		} else {
			t = values[index];
		}
		return t;
	}
	
	public void add(T t) {
		updateArray();
		values[size++] = t;
	}
	
	public void updateArray() {
		if (size == values.length) {
			int newSize = defaultSize * 2;
			values = Arrays.copyOf(values, newSize);
		}
	}
}
