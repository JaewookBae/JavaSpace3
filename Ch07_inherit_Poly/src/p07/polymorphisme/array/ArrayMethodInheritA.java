package p07.polymorphisme.array;

public class ArrayMethodInheritA extends ArrayMethod {

	@Override
	public void sleep() {
		System.out.println("Overriding sleep()");
		}
	@Override
	public void showSleepStyle() {
		System.out.println("A Overriding showSleepStyle()");
	}
}
