package p06.array;

public class Dog_Main {

	public static void main(String[] args) {
	
		Dog d = new Dog();//객체 생성
		Dog[] dg = new Dog[3];//배열 객체생성
		dg[0] = new Dog("진도개", "진도");
		dg[1] = new Dog("풍산개", "풍산");
		dg[2] = new Dog("워리", "불독");
		
		//일반for
		for(int i = 0; i<dg.length; i++) {
			System.out.println(dg[i]);
			System.out.println(dg[i].toString());
			System.out.println(dg[i].name+" : "+dg[i].kind);
		}
		//향상된for
		for(Dog i : dg)
			System.out.println(i);

	}

}
