import java.sql.*;
public class BrandDelete {

    public static void main(String[] args) throws Exception {
        //连接数据库
        String url = "jdbc:mysql://localhost:3306/example?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
        String user = "root";
        String pass ="root";
        Connection conn = DriverManager.getConnection(url, user, pass);

        //建立查询语句
        String sql = "delete from tb_bran where id = 2";

        //建立查询对象并执行
        PreparedStatement pstmt = conn.prepareStatement(sql);
        int count = pstmt.executeUpdate();
        System.out.println(count);

        pstmt.close();
        conn.close();

    }
}
