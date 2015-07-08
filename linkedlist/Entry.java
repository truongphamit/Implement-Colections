package com.truong.linkedlist;

public class Entry<V> {
	private V value;
	private Entry<V> next;
	
	public Entry() {
		
	}
	
	public Entry(V value) {
		this.setValue(value);
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Entry<V> getNext() {
		return next;
	}

	public void setNext(Entry<V> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
}
