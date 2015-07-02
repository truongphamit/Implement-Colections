package ex5;

import java.util.Arrays;

public class Dictionary<K1, K2, V> {
	private int size = 0;
	private int defaultSize = 16;
	private Entry<K1, K2, V>[] values = new Entry[defaultSize];

	public int size() {
		return this.size;
	}

	public V get(K1 key1, K2 key2) {
		int index = isExist(key1, key2);
		V value = values[index].getV();
		return value;
	}
	
	public void put(K1 key1, K2 key2, V value) {
		boolean isInsert = true;
		if (isExist(key1, key2) != -1) {
			isInsert = false;
		}
		
		if (isInsert) {
			updateArray();
			values[size++] = new Entry<>(key1, key2, value);
		}
	}
	
	public void updateArray() {
		if (size == values.length) {
			int newSize = defaultSize * 2;
			values = Arrays.copyOf(values, newSize);
		}
	}
	
	public int isExist(K1 key1, K2 key2) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if ((key1 != null) && (key2 != null)) {
				if (values[i].getK1().equals(key1)
						&& values[i].getK2().equals(key2)) {
					index = i;
				}
			}
		}
		return index;
	}
	
	public boolean containKey(K1 key1, K2 key2) {
		boolean isCheck = false;
		if (isExist(key1, key2) != -1) {
			isCheck = true;
		}
		return isCheck;
	}
	
}
