package exercise;

public class ShopService18 {
	//최초에 한번 객체 생성
	private static ShopService18 s = new ShopService18();
	
	//보안: 다른 클래스에서 객체 생성 불능상태로 만듬
	private ShopService18() {

	}
	//생성된 객체를 호출
	static ShopService18 getInstance() {

		return s;
	}
}
