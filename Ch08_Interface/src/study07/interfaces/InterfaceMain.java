package study07.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		
		SeperateVolume obj1 = new SeperateVolume("86738개", "개미", "베르베르");
		obj1.checkOut("홍길동", "20180611");
		obj1.checkIn();
		
		AppCDInfo obj2 = new AppCDInfo("2021-9001", "Spring");
		obj2.checkOut("알파고", "20210517");
		obj2.checkIn();
	}

}
