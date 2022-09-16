import java.sql.*;
public class BrandUpdate {

    public static void main(String[] args) throws Exception {
        //注册驱动

        //连接数据库
        String url = "jdbc:mysql://localhost:3306/example?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
        String user = "root";
        String pass ="root";
        Connection conn = DriverManager.getConnection(url, user, pass);

        //建立查询语句
        String sql = "update tb_bran set description=?,company_name=? where id=4";

        //建立查询语句对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "hello again");
        pstmt.setString(2, "CorPest.co");

        int count = pstmt.executeUpdate();
        System.out.println(count);

        pstmt.close();
        conn.close();
    }
}
