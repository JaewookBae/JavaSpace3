package p06.generic_wildcard;

import java.util.Arrays;

public class WildCardExample {

	public static void main(String[] args) {
		// 일반인 과정
		Course<Person> p = new Course<>("일반인과정", 5);
		p.add(new Person("일반인"));
		p.add(new Worker("직장인"));
		p.add(new Student("학생"));
		p.add(new HighStudent("고등학생"));

		// 직장인 과정
		Course<Worker> w = new Course<>("직장인과정", 5);
		w.add(new Worker("직장인"));

		// 학생 과정
		Course<Student> s = new Course<>("학생과정", 5);
		s.add(new Student("학생"));
		s.add(new HighStudent("고등학생"));

		// 고등학생 과정
		Course<HighStudent> h = new Course<>("고등학생과정", 5);
		h.add(new HighStudent("고등학생"));

		registerCourse(p);
		registerCourse(w);
		registerCourse(s);
		registerCourse(h);
		System.out.println();

		registerCourseWorker(p);
		registerCourseWorker(w);
		// registerCourseWorker(s);
		// registerCourseWorker(h);
		System.out.println();

		// registerCourseStudent(p);
		// registerCourseStudent(w);
		registerCourseStudent(s);
		registerCourseStudent(h);
	}

	// 모든과정<?> (all,Object) : 모든과정 - Person, Worker, Student, HighStudent
	public static void registerCourse(Course<?> c) {

		System.out.println(c.getName() + " 수강생" + Arrays.toString(c.getStudents()));
	}

	// 학생과정 : Student, HighStudent
	public static void registerCourseStudent(Course<? extends Student> c) {

		System.out.println(c.getName() + " 수강생" + Arrays.toString(c.getStudents()));
	}

	// 직장인과정 : Person, Worker
	public static void registerCourseWorker(Course<? super Worker> c) {

		System.out.println(c.getName() + " 수강생" + Arrays.toString(c.getStudents()));
	}
}