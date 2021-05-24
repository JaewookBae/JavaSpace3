package p08.abstractclass;

public class AnimalExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		Cat c = new Cat();
		c.sound();
		animalSound(d);
		animalSound(c);
		
		
		//PolyMorphism
		Animal a = null;
		a = new Dog();
		a.sound();
		a = new Cat();
		a.sound();

		//PolyMorphism2
		Animal a2 = new Dog();
		Dog d2 = (Dog) a2;
		d2.sound();
		Animal a3 = new Cat();
		Cat c2 = (Cat) a3;
		c2.sound();

	}
	//Abstract Class 다형성: Parameter 다형성
	public static void animalSound(Animal a) {
		a.sound();
	}
}
