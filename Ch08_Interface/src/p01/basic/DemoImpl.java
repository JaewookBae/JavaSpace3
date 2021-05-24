package p01.basic;

public class DemoImpl implements ADemo, BDemo {

	@Override
	public void print() {
		System.out.println("Overriding Print()");
	}

	@Override
	public void write() {
		System.out.println("Overriding write()");
	}

}
