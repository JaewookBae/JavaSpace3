package p01.reference;

public class PointEx {

	public static void main(String[] args) {
		//1. 클래스에 값 저장 방법1 - 생성자
		Point p1 = new Point(10,20);
		System.out.println(p1.x);
		System.out.println(p1.y);
		
		
		//2. getter()%setter()를 통한 초기값 저장
		//x=30, y=40
		Point p2 = new Point();
		p2.setX(30);
		p2.setY(40);
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		
		
		//3. 변수에 직접 값 넣기 가져오기
		Point p3 = new Point();
		p3.x = 50;
		p3.y = 60;
		System.out.println(p3.x);
		System.out.println(p3.y);
	}

}
