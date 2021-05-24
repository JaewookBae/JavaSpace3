package p03_for_while_dowhile;

public class FromMultiplictionTableEx1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <=3; i++)        //i=1
			for(int j = 1; j <=3; j++)    //j=1
				for(int k = 1; k <=3; k++)//k=1,2,3
					System.out.println(""+i+j+k);//앞에 빈 문자열 넣는것은 연산하지말고 각각 결합만 하기 위함

		System.out.println("-----------------");
		for(int i = 1; i <=9; i++)        //i=1
			for(int j = 1; j <=9; j++)    //j=1,2,3,~9
				System.out.printf("%d x %d = %d\n", i, j, i*j);//앞에 빈 문자열 넣는것은 연산하지말고 각각 결합만 하기 위함

		System.out.println("-----------------");
		for(int i2 = 2; i2 <=9; i2++) {//i=2
			System.out.println("****** "+i2+"단  ******");
			for(int j2 = 1; j2 <=9; j2++) {    //j=1,2,3,~9
				System.out.println(i2 + " x " + j2 +" = " +(i2*j2) );

			}
		}
}
}