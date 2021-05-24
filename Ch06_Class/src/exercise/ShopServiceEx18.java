package exercise;

public class ShopServiceEx18 {

	public static void main(String[] args) {
		
//		ShopService18 s = new ShopService18();//Old: 객체생성
//		ShopService18 ss = new ShopService18();//Old: 객체생성
		
		ShopService18 s1 = ShopService18.getInstance();//New
		ShopService18 s2 = ShopService18.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		if(s1 == s2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");			
		}
	}

}
