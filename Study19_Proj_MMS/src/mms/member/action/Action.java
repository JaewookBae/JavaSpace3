package mms.member.action;

import java.util.Scanner;

//4. 각 요청을 제어하는 Action 클래스 객체들을 공통적으로 접글할 수 있는 인터페이스 정의
public interface Action {
	
	void execute(Scanner sc) throws Exception;
}
