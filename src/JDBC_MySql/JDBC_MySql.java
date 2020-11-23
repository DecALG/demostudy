package JDBC_MySql;


import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class JDBC_MySql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");//固定写法，加载驱动
        //2.用户信息和url
        //jdbc:mysql://localhost:3306/students连接上数据库 useUnicode=true支持中文 characterEncoding=utf8字符集编码 useSSL=true使用安全的连接
        String url="jdbc:mysql://localhost:3306/students?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username="root";
        String password="123456";
        //3.连接成功，数据库对象
        //DriverManager驱动管理 Connection代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        //4.执行SQL的对象 Statement执行sql的对象
        Statement statement = connection.createStatement();

        //5.执行SQL的对象 去 执行SQL ，可能存在的结果，查看返回结果
        String sql="select * from mess";
        ResultSet resultSet = statement.executeQuery(sql);//返回的结果集，结果集中封装了我们全部的查询出来的结果

        while(resultSet.next()){
            System.out.println("number="+resultSet.getObject("number"));
            System.out.println("name="+resultSet.getObject("name"));
            System.out.println("birthday="+resultSet.getObject("birthday"));
            System.out.println("height="+resultSet.getObject("height"));
        }

        //6.释放链接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
