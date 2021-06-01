package study11;

public class Weather {
	String city;  //지역
	String wea;   // 날씨
	String tem;  // 온도
	String rain;  // 강수량
	String hum;   // 습도
	
	public void info() {//간단정보 출력
		System.out.println("지역 : "+ city);
		System.out.println("날씨 : "+ wea);
		System.out.println("온도 : "+ tem+ "도");
		System.out.println("강수량 : "+ rain +"mm" );
		System.out.println("습도 : "+ hum + "%");	
	}
}
