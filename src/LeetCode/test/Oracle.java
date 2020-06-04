package LeetCode.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Oracle {
    public void helper() throws Exception{
        String strUrl = "jdbc:oracle:thin:@localhost:1521:tiger";// 连接字符串
        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载驱动类
        Connection coon = DriverManager.getConnection(strUrl);// 获取连接
        Statement stmt = coon.createStatement();// 创建会话
        ResultSet rs = stmt.executeQuery("SELECT * FROM books");// 执行查询操作
        if (rs.next())
            System.out.println(rs.getString("name"));// 打印结果
        coon.close();
    }
}
