package p09_instance;

class Car {
	// instance Member(변수,메소드)
	int a;

	int add(int a, int b) {
		return 10;
	}

	// 236
	// static Member(변수,메소드)
	static int b;

	static int sub(int a, int b) {
		int result = a - b;
		return result;
	}

	// 필드
	String model;
	int speed;

	// 생성자
	Car(String model){
				this.model = model;
			}

	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h");
		}
	}
}
