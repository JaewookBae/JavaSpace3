package p07.polymorphisme;

public class BaseBall extends Game {

	public void write() {
		System.out.println("BaseBasll Method()");
	}
	
	@Override
	public void type() {
		System.out.println("Inherit() - Super Game");
	
	}
}
