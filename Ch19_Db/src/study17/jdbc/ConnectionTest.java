package study17.jdbc;
// 1. DB연결하기

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	Connection con = null;

	// 가장먼저 실행
	static {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

		}
	}

	public void connect() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";//
		try {
			con = DriverManager.getConnection(url, "java", "java");
		} catch (SQLException e) {

		}
		System.out.println("Connection Success!");
	}

	public static void main(String[] args) {

		ConnectionTest c = new ConnectionTest();
		c.connect();

	}
}
