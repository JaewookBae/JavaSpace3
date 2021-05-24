package p05.system;

public class ExitExample {

	public static void main(String[] args) {

		System.setSecurityManager(new SecurityManager() {
			public void checkExit(int status) {
				if (status != 5)
					throw new SecurityException("a");
			}
		});

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			try {
				System.exit(i);// 현재 실행하고있는 프로세스를 강제종료, 보안관리자 자동호출
			} catch (SecurityException e) {
				System.out.println("y");
				System.out.println(e.getMessage());
			}
		}

	}
}
