package study18.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginSVC {
   Connection con;

   static { // 서버에 항상 올라와 있음 메인 실행시 가장 먼저 실행됨 Static이기 때문
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      } catch (ClassNotFoundException e) {
         System.out.println("ojdbc_g.jar가 해당 위치에 없습니다.");
      }
   }

   public void connect() {

      try {
         String url = "jdbc:oracle:thin:@localhost:1521:orcl";
         con = DriverManager.getConnection(url, "javalink", "javalink");
         System.out.println("Connection Success!");

      } catch (SQLException e) {
         System.out.println("주소 및 ID,PW가 다릅니다.");
      }
   }

   public User login(String id, String password) {
      connect();
      User u = null;
      Statement stmt = null;
      ResultSet rs = null;
      try {
         stmt = con.createStatement();
         String sql = "SELECT * FROM member WHERE id = '" + id + "' and password = '" + password + "'";

         rs = stmt.executeQuery(sql);

         if (rs.next()) {
            id = rs.getString(1);
            password = rs.getString(2);
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String addr = rs.getString("addr");
            String email = rs.getString("email");

            u = new User(id, password, name, age, addr, email);
         }

      } catch (SQLException e) {

      } finally {
         try {
            stmt.close();
            con.close();
         } catch (SQLException e1) {

         }
      }

      return u;

   }

}