package p05.secondary_stream;

import java.io.Serializable;

public class BBSItem implements Serializable {
	//Configuration Management(SCM): 형상관리 = 버전관리 = 구성관리
	private static final long serialVersionUID = 1L;
	
	//static, transient 직렬화 불가, 전송불가
	static int itemNum = 0;
	String writer;
	transient String passwd;// password이므로 객체전송시 제외
	String title;
	String content;

	public BBSItem(String writer, String passwd, String title, String content) {
		super();
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
	}

}
