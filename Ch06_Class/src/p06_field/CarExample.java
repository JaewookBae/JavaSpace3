package p06_field;
//201
public class CarExample {

	public static void main(String[] args) {
		
		//1.변수를 통한 저장/출력
		Car c = new Car();
		System.out.println("2.모델회사 : "+ c.company);
		System.out.println("2.모델명 : "+ c.model);
		System.out.println("2.모델색상 : "+ c.color);
		System.out.println("2.최고속도 : "+ c.maxSpeed);
		System.out.println("2.현재속도 : "+ c.speed);
		
		c.speed = 60;
		System.out.println("수정된 속도: "+ c.speed);
		//2.생성자를 통한 저장/출력
		Car c1 = new Car("현대","소나타","빨강",200,100);
		System.out.println("2.모델회사 : "+ c1.company);
		System.out.println("2.모델명 : "+ c1.model);
		System.out.println("2.모델색상 : "+ c1.color);
		System.out.println("2.최고속도 : "+ c1.maxSpeed);
		System.out.println("2.현재속도 : "+ c1.speed);
		
		c1.speed = 160;
		System.out.println("수정된속도 : " + c1.speed);
		//3.getter()와setter()를 통한 저장/출력
		Car c2 = new Car();
		c2.setCompany("아우디");
		c2.setModel("R8");
		c2.setMaxSpeed(350);
		c2.setSpeed(0);
		System.out.println("3.모델회사 : "+ c2.getCompany());
		System.out.println("3.모델명 : "+ c2.getModel());
		System.out.println("3.모델색상 : "+ c2.getColor());
		System.out.println("3.최고속도 : "+ c2.getMaxSpeed());
		System.out.println("3.현재속도 : "+ c2.getSpeed());

	}

}
