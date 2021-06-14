package mms.member.db;

import java.sql.Connection;
import java.sql.SQLException;

// 1. DB관련 공통 기능 클래스
public class JdbcUtil {

	static {
		// 클래스가 로딩될 때 단 한번 호출되는 영역
		// Class.forName : 특정 클래스를 메로리로 로딩하는 메소드

	}

	public static Connection getConnection() {
		// DB 작업에 필요한 Connection 객체를 생성해 주는 메소드
		return null;

	}

	public static void close(Connection con) {

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//transaction 처리 메소드
}
