package JDBC_MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test_del {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/students?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username="root";
        String password="123456";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String sql="DELETE from mess where number='R1002'";
        int i = statement.executeUpdate(sql);

        if(i>0){
            System.out.println("删除成功");
        }

        statement.close();
        connection.close();


    }
}
