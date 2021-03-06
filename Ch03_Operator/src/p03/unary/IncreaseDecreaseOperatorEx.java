package p03.unary;

public class IncreaseDecreaseOperatorEx {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		//System.out.println(x++);
		System.out.println("x="+ x); //12
		
		y--;
		//System.out.println(y--);
		--y;
		System.out.println("y="+ y); //8
		
		z = x++; //z에 먼저 x값을 준 다음에 x+1
		System.out.println("z="+ z); //12
		System.out.println("x="+ x); //13

		z = ++x;//x13에서 +1해서 z값
		System.out.println("z="+ z); //14
		System.out.println("x="+ x); //14
		
		z = ++x + y++; //15+8
		System.out.println("z="+ z); //23
		System.out.println("x="+ x); //15
		System.out.println("y="+ y); //9
	}

}
