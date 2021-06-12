package study18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginSVC {

	Connection con;
	Statement stmt;
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
			con = DriverManager.getConnection(url, "javalink", "javalink");
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			System.out.println("주소 및 id&pw가 다릅니다.");
		}
	}

	public User login(String id, String passwd) {
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM member WHERE id = '" + id + "' AND " +
					"passwd = '" + passwd + "'";

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
				System.out.println("아이디 : " + rs.getString(1) + ", 비밀번호 : " + rs.getString(2) + ", 이름 : "
						+ rs.getString("name") + ", 나이 : " + rs.getString("age") + ", 주소 : " + rs.getString(5)
						+ ", 이메일 : " + rs.getString(6));
		} catch (SQLException e) {

		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {

			}
		}
		return null;
	}
}
