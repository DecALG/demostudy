package JDBC_MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test_update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/students?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username="root";
        String password="123456";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String sql="UPDATE mess set name='李六' where number='R1001'";
        int i = statement.executeUpdate(sql);

        if(i>0){
            System.out.println("修改成功");
        }

        statement.close();
        connection.close();


    }
}
