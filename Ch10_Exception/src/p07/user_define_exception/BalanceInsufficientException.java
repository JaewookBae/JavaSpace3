package p07.user_define_exception;

public class BalanceInsufficientException extends Exception {
	
	//버전, 형상, 구성관리(Software Configuration Management) : Git, SVN
	private static final long serialVersionUID = 1L;
	
	public BalanceInsufficientException() {
	
	}
	public BalanceInsufficientException(String message) {
		super(message);//부모의 Parameter 생성자
	}
	
}
