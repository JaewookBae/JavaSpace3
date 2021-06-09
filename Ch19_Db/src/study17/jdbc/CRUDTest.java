package study17.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Create/Read/Update/Delete
public class CRUDTest {

	Connection con = null;

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

	public void insert() {
		connect();
		try {
			String str = "INSERT INTO MEMBER1";
					str += "VALUES('aaa','1111','홍길동','22','서울시','a@a.com')";
			Statement stmt = con.createStatement();
			stmt.executeQuery(str);
			System.out.println("Insert Success!");
		} catch (SQLException e) {
			System.out.println("입력 실패");
		}
		System.out.println("Insert 수행 후");
	}

	public void select() {

	}

	public void update() {

	}

	public void delete() {

	}

	public static void main(String[] args) {
		CRUDTest ct = new CRUDTest();
		ct.insert();
	}

}
