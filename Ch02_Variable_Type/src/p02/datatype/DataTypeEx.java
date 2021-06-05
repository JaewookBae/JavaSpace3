package p02.datatype;

import p01.variable.VariableEx;

//CPU - RAM - SSD
public class DataTypeEx {

	public static void main(String[] args) {
		// 1. Primitive Type(기본형) : 변수에 실제값 저장
		byte by = 127; //-128 ~ 127, 1byte 크기
		char ch = 'a'; //문자 1개 저장, 2byte 크기
		short sh = 32767; //-32768 ~ 32767, 2byte 크기
		//default : int
		int in = 2100000000; //-21억 ~ 21억, 4byte 크기
		long lo = 2100000000000000000L; //가장 큰 타입, 8byte 크기
		
		boolean bo = true; //1byte 크기, default(false)
		
		
		//소수점에서  default : double
		double d = 10.7; //8byte 크기
		float f = 9.1f; //4byte 크기
		
		System.out.println(by);
		System.out.println(ch);
		System.out.println(bo);
		
		System.out.println(f);
		
		//2. Reference Type(참조형) : 참조 변수에 주소값
		VariableEx ve = new VariableEx();
		System.out.println(ve);
		
		String s = new String();
		System.out.println("s: "+ s);
		
		String s2 = new String("홍길동");
		System.out.println(s2);
	}

}
