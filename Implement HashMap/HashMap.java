package com.truong.hashmap;

public class HashMap<K, V> {
	private int size = 0;
	private int defaultSize = 16;
	
	private Entry<K, V>[] map = new Entry[defaultSize];
	
	public int hashCode(K key) {
		return key.hashCode() % defaultSize;
	}
	public int size() {
		return size;
	}
	
	public void put(K key, V value) {
		int hash = hashCode(key);
		Entry<K, V> entry = new Entry<K, V>(key, value);
		if (map[hash] == null) {
			map[hash] = entry;
			++size;
		} else {
			Entry<K, V> current = map[hash];
			while (current.getNext() != null) {
				if(current.getKey().equals(entry.getKey())) {
					current.setValue(entry.getValue());
					break;
				} else {
					current = current.getNext();
				}
			}
			if (current.getNext() == null) {
				if (current.getKey().equals(entry.getKey())) {
					current.setValue(entry.getValue());
				} else {
					current.setNext(entry);
				}
			}
			
		}
	}
	
	public V get(K key) {
		int index = hashCode(key);
		Entry<K, V> entry = map[index];
		while (entry != null) {
			if (entry.getKey().equals(key)) {
				return entry.getValue();
			}
			entry = entry.getNext();
		}
		
		return null;
	}
}
