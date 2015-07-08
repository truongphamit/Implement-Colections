package com.truong.linkedlist;

public interface List<V> {
	public void add(V value);
	public void add(int index, V value);
	public V get(int index);
	public int indexOf(V value);
	public int size();
	public void remove(V value);
	public void remove(int index);
	public boolean isEmpty();
	public boolean contains(V value);
	public void clear();
	public void set(int index, V value);

}
