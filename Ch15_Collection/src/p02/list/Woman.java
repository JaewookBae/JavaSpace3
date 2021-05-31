package p02.list;

public class Woman {

	String name;// 베타고, 알파고
	int age; // 20, 10

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Woman(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Woman(int age) {

		this.age = age;
	}

	public Woman(String name) {

		this.name = name;

	}
	@Override
	public String toString() {
	
		return name + " : " + age;
	}

}
