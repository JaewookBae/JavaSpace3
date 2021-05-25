package exercise;

public class Student {
	
	//HashMap, HashTable, HashSet: 동등객체 비교시 - Hashcode(),equals()
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			if(this.studentNum.equals(s.studentNum)) {
				return true;
			}
		}
		return false;
	}
}
