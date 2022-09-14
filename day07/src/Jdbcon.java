import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.ErrorManager;



public class Jdbcon {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static final String DB_URL = "jdbc:mysql://localhost:3306/example?useSSL=false";

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        ErrorManager logger = null;
        try {
            //注册JDBC驱动器
            Class.forName("com.mysql.cj.jdbc.Driver");
            //打开链接
            System.out.println("connection to database...");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }

        try {
            conn = DriverManager.getConnection(DB_URL, "root", "root");
            if (null != conn) {
                System.out.println("connection SUCCESS");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }
}
