package p05.secondary_stream;

import java.io.Serializable;

// 우리가 만든 클래스 직렬화: "implements Serializable" 사용
public class GoodStock implements Serializable {

	String code;
	int num;

	public GoodStock(String code, int num) {
		this.code = code;
		this.num = num;
	}

}
