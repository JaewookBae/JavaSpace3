package p06.array;

public class Dog {

	String name, kind;

	public Dog() {

	}

	public Dog(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", kind=" + kind + "]";
	}

}
