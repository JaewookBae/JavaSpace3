package exercise;

public class Student {

	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {

		return sno;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (student.sno == sno) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}