package com.truong.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<V> implements List<V> {
	private int size = 0;
	Entry<V> first = new Entry<V>();

	public int size() {
		return size;
	}

	public void add(V value) {
		Entry<V> newEntry = new Entry<V>(value);
		Entry<V> current = first;
		if (current.getValue() == null) {
			current.setValue(value);
			++size;
		} else {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newEntry);
			++size;
		}
	}

	public V get(int index) throws IndexOutOfBoundsException {
		Entry<V> current = first;
		if (index > size - 1 || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		} else {
			int i = 0;
			while (i != index) {
				current = current.getNext();
				++i;
			}
		}
		return current.getValue();
	}

	public void remove(V value) {
		Entry<V> current = first;
		Entry<V> previous = first;
		if (!isEmpty()) {
			while (!current.getValue().equals(value)) {
				previous = current;
				current = current.getNext();
			}
			if (current == first) {
				first = first.getNext();
			}
			previous.setNext(current.getNext());
			--size;
		}

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean contains(V value) {
		boolean isCheck = false;
		Entry<V> current = first;
		if (!isEmpty()) {
			if (current.getValue().equals(value)) {
				isCheck = true;
			} else {
				while (current.getNext() != null) {
					current = current.getNext();
					if (current.getValue().equals(value)) {
						isCheck = true;
					}
				}
			}
		}
		return isCheck;
	}

	public void clear() {
		first = null;
		size = 0;
	}

	public void addFirst(V value) {
		Entry<V> newFirst = new Entry<V>();
		newFirst.setValue(value);
		newFirst.setNext(first);
		first = newFirst;
		++size;
	}

	public void addLast(V value) {
		Entry<V> current = first;
		if (current.getValue() == null) {
			current.setValue(value);
			++size;
		} else {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			Entry<V> newEntry = new Entry<V>(value);
			current.setNext(newEntry);
			++size;
		}

	}

	public V getFirst() throws NoSuchElementException {
		V value = null;
		if (size == 0) {
			throw new NoSuchElementException();
		} else {
			value = first.getValue();
		}
		return value;
	}

	public V getLast() throws NoSuchElementException {
		V value = null;
		Entry<V> current = first;
		if (size == 0) {
			throw new NoSuchElementException();
		} else {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			value = current.getValue();
		}
		return value;
	}

	public void removeFirst() {
		first = first.getNext();
		--size;
	}

	public void removeLast() {
		Entry<V> current = first;
		Entry<V> previous = first;
		if (!isEmpty()) {
			while (current.getNext() != null) {
				previous = current;
				current = current.getNext();
			}
			if (current == first) {
				first = first.getNext();
			}
			previous.setNext(current.getNext());
			--size;
		}
	}

	public V peek() {
		return getFirst();
	}

	public V poll() {
		V value = first.getValue();
		removeFirst();
		return value;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		if (!isEmpty()) {
			Entry<V> current = first;
			while (current.getNext() != null) {
				str.append(current.getValue().toString() + " ");
				current = current.getNext();
			}
			str.append(current.getValue().toString());
		}
		return str.toString();
	}

	public void add(int index, V value) {
		/*
		int i = 0;
		if (!isEmpty()) {
			Entry<V> current = first;
			while (i != index) {
				current = current.getNext();
				++i;
			}
			System.out.println(current.getValue());
			// To do something
		}
		*/
		// Fail
	}

	public int indexOf(V value) {
		int index = -1;
		int i = 0;
		boolean isCheck = false;
		Entry<V> current = first;
		if (!isEmpty()) {
			while (current != null) {
				if (current.getValue().equals(value)) {
					isCheck = true;
					break;
				}
				current = current.getNext();
				++i;
			}
		}
		if (isCheck) {
			index = i;
		}
		return index;
	}

	public void remove(int index) throws IndexOutOfBoundsException{
		Entry<V> current = first;
		Entry<V> previous = first;
		int i = 0;
		
		if (index > size - 1 || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		
		if (!isEmpty()) {
			while (i != index) {
				previous = current;
				current = current.getNext();
				++i;
			}
			if (index == 0) {
				first = first.getNext();
			}
			previous.setNext(current.getNext());
			--size;
		}

	}

	public void set(int index, V value) throws IndexOutOfBoundsException{
		Entry<V> current = first;
		int i = 0;
		if (index > size - 1 || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		if (!isEmpty()) {
			while (i != index) {
				current = current.getNext();
				++i;
			}
			current.setValue(value);
		}
	}

}
