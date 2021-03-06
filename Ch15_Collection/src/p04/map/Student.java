package p04.map;

public class Student {

	public int sno;
	public String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {

		return (name + sno).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return this.name.equals(s.name) && this.sno == s.sno;
		}
		return false;
	}
}
