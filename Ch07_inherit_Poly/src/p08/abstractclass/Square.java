package p08.abstractclass;

public class Square extends Figure {

	@Override
	void area(int height, int width) {

		System.out.println("사각형의 넓이 : " + (height * width));
	}

}
