package p07.string;

public class SplitEx {

	public static void main(String[] args) {
		
		String txt = "홍길동&알파고,베타고,김일동-최두팔";
		String[] name = txt.split("&|,|-");
		for(String s : name)
			System.out.println(s);
	}

}
