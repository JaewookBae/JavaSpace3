package p01.start;

public class Start4_Main {

	public static void main(String[] args) {
		Start4.main(args);
		Start4 v = new Start4();
		
		System.out.println(v.a);
		System.out.println(Start4.b);
		v.mul();
		Start4.mul2();
	Start4_Main s = new Start4_Main();
	System.out.println(s.add(10.0, 20));
	
	
	}
	
	double add(double a, int b) {
		double result = a+b;
		return result;
	}
}
