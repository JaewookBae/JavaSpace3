package study01;
//같은 클래스를 이용해서 여러 객체 만들기 테스트
public class AirConUse2 {

	public static void main(String[] args) {
		//1. 첫번째 객체생성
		AirCon airCon1 = new AirCon();
		//변수 사용
		airCon1.color = "Red";
		airCon1.temp = 30;
		airCon1.price = 30000;
		
		//메소드 사용
		airCon1.tempUp();
		System.out.println("airCon1.temp = " + airCon1.temp + ", airCon1.color = " + airCon1.color+ ", airCon1.price = " + airCon1.price+"원");
		airCon1.powerOn();
		airCon1.powerOff();
		airCon1.tempDown();
		System.out.println("airCon1.temp = " + airCon1.temp + ", airCon1.color = " + airCon1.color+ ", airCon1.price = " + airCon1.price+"원");
		
		//2. 두 번째 객체 생성
			//getter(), setter()를 이용: color=yellow, temp=40, price=40000
		
		AirCon airCon2 = new AirCon();
		airCon2.setColor("yellow");
		airCon2.setTemp(40);
		airCon2.setPrice(40000);
		
		System.out.println("airCon2.temp = " + airCon2.getTemp() + ", airCon2.getColor = " + airCon2.getColor()+ ", airCon2.getPrice = " + airCon2.getPrice()+"원");
		
		//airCon2 변수에 airCon1 변수 참조 값 할당
		airCon2 = airCon1; //airCon2에 airCon1 주소값 저장
		System.out.println("airCon2.temp = " + airCon2.temp + ", airCon2.color = " + airCon2.color+ ", airCon2.price = " + airCon2.price+"원");
		
	}

}
