package p07.enums;
//enum 타입이 사용되기 전
public class OldEx {

	public static void main(String[] args) {
		//"1111", "반팔티셔츠", "면100%", 여름출력
		ClothingInfo cf = new ClothingInfo("1111", "반팔티셔츠", "면100%", ClothingInfo.SUMMER);
		System.out.println("상품코드 : "+ cf.code);
		System.out.println("상품명 : "+ cf.name);
		System.out.println("상품소재 : "+ cf.material);
		System.out.println("계절구분 : "+ cf.season);//2 : enum을 사용전에 출력
		
	
		
		

	}

}
