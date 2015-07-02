package ex5;

public class Entry<K1, K2, V> {
	private K1 key1;
	private K2 key2;
	private V value;
	
	public Entry(K1 key1, K2 key2, V value) {
		this.key1 = key1;
		this.key2 = key2;
		this.value = value;
	}
	
	public V getV() {
		return value;
	}
	
	public K1 getK1() {
		return key1;
	}
	
	public K2 getK2() {
		return key2;
	}
	
	public void setV(V value) {
		this.value = value;
	}
}
