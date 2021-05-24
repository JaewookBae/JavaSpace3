package p07.polymorphism;
//PolyMorphism(다형성): 여러개의 개별적인 클래스를 하나의 부모 클래스 객체로 통합관리해서 효율성을 높인것.
//부모(큰타입), 자식(작은타입)
//형변환: 상속관계에서만 가능!!!

//PolyMorphism 종류 : (1)Class 변수의 다형성
//					(2)Method의 다형성
//					(3)Parameter의 다형성
//					(4)Array의 다형성
//					(5)Abstract Class의 다형성
//					(6)Interface의 다형성
public class PolyEx1 {

	public static void main(String[] args) {
		
		//Primitive
		byte a = 10;//1byte
		short b = 20;//2
		int c = 330;//4
		long d = 4000;//8

		//큰타입    = 작은타입
		long e1 = a;//Promotion(자동형변환)
		long e2 = b;
		long e3 = c;
	//작은타입      =(작은타입)큰타입;
		int k = (int)e1;//Casting(강제형변환)
		
		//상속관계가 아니므로 성립 불가
		//String str = new BaseBall();
		
		//형변환: 상속관계에서만 가능!!!
		//Reference
		BaseBall b1 = new BaseBall();
		b1.type();
		b1.write();
		System.out.println("--------PolyMorphism 형변환-------");
		//Poly방법1
		//부모 클래스의 눈으로 생성된 자식을 바라보면 
		Game b2 = new BaseBall();//상속관계에서만 가능
		b2.type();//Promotion(자동형변환)
		((BaseBall) b2).write();//Casting(강제형변환)

		//Poly방법2
		//부모 클래스의 눈으로 생성된 자식을 바라보면 
		Game b3 = new BaseBall();//상속관계에서만 가능
		BaseBall bb = (BaseBall) b3;//Casting(강제형변환)
		bb.type();//Promotion(자동형변환)
		bb.write();
		System.out.println("------------------------------");
	}

}
