package p08.abstractclass;

public class AbstactBasic_Main {

	public static void main(String[] args) {
		AbstractBasic_Child ac = new AbstractBasic_Child();
		System.out.println(ac.num);
		ac.methodA();
		ac.methodB();
		ac.print();
		
		//PolyMorphism 1
		AbstractBasic ab = new AbstractBasic_Child();
		System.out.println(ab.num);
		ab.methodA();
		ab.methodB();
		((AbstractBasic_Child)ab).print();//Castind 강제형변환

		//PolyMorphism 2
		AbstractBasic ab2 = new AbstractBasic_Child();
		AbstractBasic_Child abc = (AbstractBasic_Child) ab2;//Casting
		System.out.println(abc.num);
		abc.methodA();
		abc.methodB();
		abc.print();
	}

}
