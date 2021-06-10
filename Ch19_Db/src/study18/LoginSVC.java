package study18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginSVC {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6_g.jar가 해당 위치에 없습니다.");
		}
	}
	public void connect() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";//
			Connection con = DriverManager.getConnection(url, "javalink", "javalink");
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			System.out.println("주소 및 id&pw가 다릅니다.");
		}
	}
	public User login(String id, String passwd) {
		return null;
		
	}
}
