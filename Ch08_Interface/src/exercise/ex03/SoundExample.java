package exercise.ex03;

public class SoundExample {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		Soundable s = new Soundable() {
			
			@Override
			public String sound() {

				return "구구";
			}
		};
		
		printSound(c);
		printSound(new Dog());
		printSound(s);

	}

}
