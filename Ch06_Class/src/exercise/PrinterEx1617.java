package exercise;

public class PrinterEx1617 {

	public static void main(String[] args) {

		//인스턴스메소드 호출(16)
		Printer1617 p = new Printer1617();
		p.println(10);
		p.println(true);
		p.println(5.7);
		p.println("홍길동");
		
		System.out.println("-------------------");
		//static method호출(17)
		Printer1617.printlns(20);
		Printer1617.printlns(false);
		Printer1617.printlns(20.0);
		Printer1617.printlns("hong");
	}

}
