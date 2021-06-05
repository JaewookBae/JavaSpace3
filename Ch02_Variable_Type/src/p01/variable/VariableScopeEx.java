package p01.variable;

public class VariableScopeEx {

	public static void main(String[] args) {
		//블록 안에 있는 변수는 밖에서 사용할 경우 : 변수 언언을 밖에서 해야 한다.
		int v2 = 0;
		int v1 = 15;
		if(v1>10) {
			
			 v2 = v1-10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
