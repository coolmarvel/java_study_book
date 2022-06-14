package sec14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemo3 {
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
        StringBuilder sql = new StringBuilder();

        sql.append("INSERT INTO person (name, phone, email)");
        sql.append("VALUES(?, ?, ?)");

        PreparedStatement pStatement = con.prepareStatement(sql.toString());
        pStatement.setString(1, "배장화");
        pStatement.setString(2, "010-2222-3333");
        pStatement.setString(3, "bae@two.com");
    }
}
