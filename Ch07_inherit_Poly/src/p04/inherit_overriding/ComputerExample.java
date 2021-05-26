package p04.inherit_overriding;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println();             //재정의된 메소드 호출
		System.out.println("원면적 : " + calculator.areaCircle(r));

	}

}
