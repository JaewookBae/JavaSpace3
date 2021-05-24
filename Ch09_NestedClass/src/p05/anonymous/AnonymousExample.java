package p05.anonymous;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous a = new Anonymous();
		a.field.wake();
		a.method1();
		
//		Person p = new Person() {
//			void study() {
//				System.out.println("공부합니다.");
//			}
//			void wake() {
//				System.out.println("8시 기상합니다.");
//				study();
//			}
//		};
		a.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			void wake() {
				System.out.println("8시 기상합니다.");
				study();
			}
		});
	}

}
