import java.sql.*;
public class InsertUserTest {
    public static Connection connection = null;
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false"
                    ,"root", "root");
            Statement statement = connection.createStatement();
            boolean execute = statement.execute("insert into user value (0, 'hello', 50, 'man')");
            if (execute) {
                System.out.println("insert failed");
            } else {
                System.out.println("insert sucess!!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
