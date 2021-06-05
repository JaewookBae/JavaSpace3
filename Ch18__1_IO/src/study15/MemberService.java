package study15;

import java.util.Scanner;

import javax.xml.ws.Action;

public class MemberService {

	void process(Action action, Scanner sc) {
		action.execute(sc);
	}
}
