package study01;

import java.io.ObjectInputStream.GetField;

//객체의 변수와 메소드 사용 테스트
//CPU   RAM    SSD
public class AirConUse {
	// main(): 프로그램의 시작
	public static void main(String[] args) {
		// 객체생성
		AirCon airCon = new AirCon();
               //참조형타입
		// 1. 변수 사용 저장
		airCon.color = "White";
		airCon.temp = 10;
		airCon.price = 10000;

		// 메소드 사용
		airCon.tempUp();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color + ", airCon.price = "
				+ airCon.price + "원");
		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		System.out.println(airCon.temp);
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color + ", airCon.price = "
				+ airCon.price + "원");

		//2. 변수에 값 저장
		airCon.setColor("blue");
		airCon.setTemp(20);
		airCon.setPrice(20000);
		
		airCon.tempUp();
		System.out.println("airCon.temp = " + airCon.getTemp() + ", airCon.color = " + airCon.getColor() + ", airCon.price = "
				+ airCon.getPrice() + "원");
		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		System.out.println(airCon.temp);
		System.out.println("airCon.temp = " + airCon.getTemp() + ", airCon.color = " + airCon.getColor() + ", airCon.price = "
				+ airCon.getPrice() + "원");
	}

}
