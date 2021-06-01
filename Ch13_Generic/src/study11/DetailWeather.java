package study11;

public class DetailWeather extends Weather {
	String dust; 
	String direction;
	//날씨 상세 정보 
	public void info(int a) {
		super.info();
		System.out.println("미세먼지농도 : "+ dust +"%" );
		System.out.println("풍향 : "+ direction );	
	}
}
