import java.sql.*;
public class Jdbc3 {
    //JDBC 驱动器
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //数据库的URL
    static final String DB_URL =
            "jdbc:mysql://localhost:3306/example?useSSL=false";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            //注册JDC 驱动程序
            Class.forName(JDBC_DRIVER);

            //打开连接
            System.out.println("start connection...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            //创建所需的ResultSet，双向，只读
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                        ResultSet.CONCUR_READ_ONLY);
            String sql;
            sql = "SELECT id, name, age FROM Students";
            ResultSet rs = stmt.executeQuery(sql);

            //将光标移动最后一行
            System.out.println("move curse to the last line");
            //rs.last();
            rs.absolute(3);

            //处理结果集
            int id = rs.getInt("id");
            int age = rs.getInt("age");
            String name = rs.getString("name");

            //显示
            System.out.println("ID: " + id);
            System.out.println("AGE: " + age);
            System.out.println("NAME: " + name);

            //将光标移动到第一行
            System.out.println("move course to the first line");
            rs.first();

            //处理结果集
            id = rs.getInt("id");
            age = rs.getInt("age");
            name =rs.getString("name");

            //显示处理结果
            System.out.println("print the first line's data");
            System.out.println("ID: " + id);
            System.out.println("AGE: " + age);
            System.out.println("NAME: " + name);

            System.out.println();

            //将光标移动到下一行
            System.out.println("move course to the next line");
            rs.next();

            //处理结果集
            id = rs.getInt("id");
            age = rs.getInt("age");
            name =rs.getString("name");

            //显示处理结果
            System.out.println("print the datas of the first line");
            System.out.println("ID: " + id);
            System.out.println("AGE: " + age);
            System.out.println("NAME: " + name);

            stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            sql = "SELECT id, name, age FROM Students";
            rs = stmt.executeQuery(sql);

            //insert data to the result
            rs.moveToInsertRow();
            rs.updateInt("id", 5);
            rs.updateInt("age", 50);
            rs.updateString("name", "Welock");
            //update the datebase
            rs.insertRow();

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
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
