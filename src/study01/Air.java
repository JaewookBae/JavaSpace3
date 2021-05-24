package study01;

public class Air {

	String name;//홍길동

	//Constructor Overloading: 생성자가 여러개이며, 파라미터의 갯수, 순서, 타입이 각각 다른 것
	//기본생성자
	public Air() {
		
	}
	
		//파라미터가 있는 생성자: 클래스명 사용, return없음, 초기값 저장 용도
		public Air(String name) {
			this.name = name;
	}


		public String getName() {
			return name;
		}
		
		//setter(): 데이터 저장
		public void setName(String name) {
			this.name = name;
		}
		
	}

