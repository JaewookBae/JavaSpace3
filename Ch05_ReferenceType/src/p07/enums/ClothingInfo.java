package p07.enums;

public class ClothingInfo {

	String code,name,material;
	int season;
	
	static final int SPRING = 1;//고정상수: 값 변경 불가
	//Spring = 2; 안됨
	static final int SUMMER = 2;
	static final int FALL = 3;
	static final int WINTER = 4;
	
	public ClothingInfo(String code, String name, String material, int season) {
		super();
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}
	
	
}
