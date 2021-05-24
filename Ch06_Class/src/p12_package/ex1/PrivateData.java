package p12_package.ex1;

public class PrivateData {

	 private int publicVar = 50;

	 public PrivateData() {
		System.out.println("기본 생성자");
		add();
	 }
	 private void add() {
		System.out.println(10);
	}
	 
	 static int add2() {
		 PrivateData pd = new PrivateData();
		 pd.add();
		 return 100;
		 
	 }
}
