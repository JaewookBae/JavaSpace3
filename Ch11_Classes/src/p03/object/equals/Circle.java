package p03.object.equals;

public class Circle {

	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {//c2
		if (!(obj instanceof Circle)) {
			return false;
		}
		Circle c = (Circle) obj;
		if (this.radius == c.radius)
			return true;
		else
			return false;
	}
}
