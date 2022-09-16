import java.sql.*;
import java.util.logging.ErrorManager;



public class Jdbcon {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //static final String DB_URL = "jdbc:mysql://localhost:3306/example?useSSL=false";
    static final String DB_URL =
            "jdbc:mysql://localhost:3306/example?useSSL=false";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            //注册JDBC驱动器
            Class.forName(JDBC_DRIVER);

            //打开连接
            System.out.println("connection to database....");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //执行查询
            System.out.println("create SQL statement...");

            //这里我们要更改一个同学的年龄，参数待定
            String sql = "UPDATE Students set age=? WHERE id=?";
            stmt = conn.prepareStatement(sql);

            //将值绑定到参数，参数从左到右序号为1，2...
            stmt.setInt(1,202);
            stmt.setInt(2,1);

            //更新ID为1的同学的年龄
            int rows = stmt.executeUpdate();
            System.out.println("被影响的行数: " + rows);

            //查询所有记录，并显示
            sql = "SELECT id, name, age FROM Students";
            ResultSet rs = stmt.executeQuery(sql);

            //处理结果集
            while (rs.next()) {
                //检索
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");

                //显示
                System.out.println("ID: " + id);
                System.out.println(", Age: " + age);
                System.out.println(", Name: " + name);
                System.out.println();
            }

            //清理
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se3) {
                se3.printStackTrace();
            }
        }
        System.out.println("Goodbye!");

    }



}
