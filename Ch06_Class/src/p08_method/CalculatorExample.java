package p08_method;

public class CalculatorExample {

	public static void main(String[] args) {
	
	Calculator mycalc = new Calculator();
	mycalc.powerOn();
	
	int result1 = mycalc.plus(5, 6);
	System.out.println("result1: "+ result1);
	
	byte x = 10;
	byte y = 4;
	double result2 = mycalc.divide(x, y);
	System.out.println("result2: "+ result2);
	
	mycalc.powerOff();
	
	
}
}
