package exercise;

public class ContainerExample2 {

	public static void main(String[] args) {

		Container2<String, String> container1 = new Container2<>();
		container1.set("홍길동", "도적");
		String name = container1.getKey();
		String job = container1.getValue();

		Container2<String, Integer> container2 = new Container2<>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}
}
