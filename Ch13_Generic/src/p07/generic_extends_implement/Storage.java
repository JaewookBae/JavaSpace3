package p07.generic_extends_implement;

public interface Storage<T> {

	public void add(T item, int index);
	public T get(int index);
}
