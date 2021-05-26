package p03.inherit_constructor;

public class Member_Main extends Member {
		
		int age = 220;
		//생성자
		public Member_Main(String name) {
			//this.name = name;
			super(name);
		}
		
		public Member_Main() {
			
		}
		
		 void getInfo() {
			System.out.println("부모 age: " + super.age);
			System.out.println("자식 age: " + this.age);
		}
		 
		 public static void main(String[] args) {
			
			 Member_Main m = new Member_Main();
			 m.getInfo();
			 System.out.println(m.name);
			 Member_Main m2 = new Member_Main("홍길동");
			 m2.getInfo();
			 System.out.println(m2.name);
		}
		 
	}


