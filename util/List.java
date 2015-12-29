package teaching.util;

public interface List<E> {
	
	E get(int index);
	E set(int index, E e);
	boolean add(E e);
	void add(int index, E e);
	E remove(int index);
	boolean remove(Object o);
	int indexOf(Object e);
	boolean isEmpty();
	int size();
	boolean contains(Object o);
}

