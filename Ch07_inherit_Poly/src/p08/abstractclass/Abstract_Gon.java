package p08.abstractclass;

public class Abstract_Gon {

	public static void main(String[] args) {
		
		Square f1 = new Square();
		f1.area(10, 20);
		Triangle f2 = new Triangle();
		f2.area(10, 20);
		
		//PolyMorphism
		Figure t1 = null;
		t1 = new Square();
		t1.area(5, 6);
		t1 = new Triangle();
		t1.area(5, 6);
		
		Figure f = new Triangle();
		Triangle ft = (Triangle) f;
		Figure s = new Square();
		Square fs = (Square) s;
		
		ft.area(10, 5);
		fs.area(20, 8);
	}

}
