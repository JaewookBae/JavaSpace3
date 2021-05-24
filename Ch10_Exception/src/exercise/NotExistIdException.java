package exercise;

public class NotExistIdException extends Exception {

	private static final long serialVersionUID = 1L;
	//생성자: 객체 생성시 초기값 저장
	public NotExistIdException() {
		
	}
	public NotExistIdException(String message) {
		super(message);
	}
}
