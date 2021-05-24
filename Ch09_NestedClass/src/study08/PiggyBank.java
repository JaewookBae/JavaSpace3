package study08;

public class PiggyBank {

	int total;
	Slot slot;

	//생성자
	public PiggyBank(){
		total = 0;
		slot = new Slot();
	}
	//Instance Inner Class
	class Slot{//입구 클래스
		void put(int amount) {
			total += amount;// Over Class를 직접 사용
		}
	}
}
