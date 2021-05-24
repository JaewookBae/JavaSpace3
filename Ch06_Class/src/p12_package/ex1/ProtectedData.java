package p12_package.ex1;

public class ProtectedData {

	protected int publicVar = 50;

	 protected ProtectedData() {
		System.out.println("기본 생성자");
		add();
	 }
	 protected void add() {
		System.out.println(10);
	}
	 
	 static int add2() {
		 ProtectedData pd = new ProtectedData();
		 pd.add();
		 return 100;
		 
	 }
}
