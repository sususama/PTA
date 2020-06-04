package LeetCode.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Excel {
    public void helper() throws Exception {
        String strUrl = "jdbc:odbc:testExcel";
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection conn = DriverManager.getConnection(strUrl);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from books");
        if (rs.next()) System.out.println(rs.getString("name"));
    }
}
