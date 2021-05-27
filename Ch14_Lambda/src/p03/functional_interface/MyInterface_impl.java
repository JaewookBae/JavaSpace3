package p03.functional_interface;

public class MyInterface_impl implements MyInterface {

	@Override
	public void calculate(int x, int y) {

		int result = x * y;
		System.out.println(result);

	}

}
