import java.sql.*;
public class JdbcInsertTest {
    public static Connection connection = null;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/example2?useSSL=false"
                            ,"root", "root");
            Statement statement = connection.createStatement();
            boolean execute = statement.execute("insert into Students value (0, 1,'shiyanlou')");
            if (execute) {
                System.out.println("insert failed");
            } else {
                System.out.println("insert sucess!!");
            }

            //批量插入，需要关闭自动提交
            connection.setAutoCommit(false);
            String sql = "insert into Students value (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //设置插入的值
            for (int i = 1; i <= 10; i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setInt(2, i + 10);
                preparedStatement.setString(3, "shiyanlou");
                preparedStatement.addBatch();
            }
            //执行批量插入，使用executeBatch方法
            preparedStatement.executeBatch();
            //提交到数据库
            connection.commit();
            System.out.println("提交批量插入完成");


            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
