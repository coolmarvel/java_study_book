package sec14;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBDemo2 {
    public static Connection makeConnection() {
        String url = "jdbc:mysql://localhost/contracts";
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbcDriver");
            System.out.println("DB Connecting...");
            con = DriverManager.getConnection(url, "root", "1234");
            System.out.println("Db Connected...");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾지 못했습니다..");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패");
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {
        Connection con = makeConnection();
        Statement stmt = con.createStatement();

        String sql = "INSERT INTO person (name, phone, email) VALUES" + "('임꺽정','010-4444-4444','lim@four.com'";

        if (stmt.executeUpdate(sql) == 1) {
            System.out.println("레코드 추가 성공");
        } else {
            System.out.println("레코드 추가 실패");
        }
        con.close();
        stmt.close();
    }
}
