package exercise;

public class Exercise02 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);//11+20
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println(z); //31
		
	}

}
