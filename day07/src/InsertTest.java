import java.sql.*;
public class InsertTest {

    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //连接数据库
        String url = "jdbc:mysql://localhost:3306/example?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
        String user = "root";
        String pass = "root";
        Connection connection = DriverManager.getConnection(url, user, pass);

        //编写sql语句
        String sql = "update Students set age = 200 where id = 2";

        //建立查询对象执行sql语句
        Statement stmt = connection.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println("影响的行数: " + count);

        stmt.close();
        connection.close();
    }
}
