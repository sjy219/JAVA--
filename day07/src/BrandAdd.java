import java.sql.*;
public class BrandAdd {

    public static void main(String[] args) throws Exception {
        //注册驱动

        //连接数据库
        String url = "jdbc:mysql://localhost:3306/example?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
        String user = "root";
        String pass ="root";
        Connection conn = DriverManager.getConnection(url, user, pass);

        //建立查询语句
        String sql = "insert into tb_bran (brand_name,company_name,ordered,description,status) values (?,?,?,?,?)";

        //建立插叙对象 执行查询语句
        PreparedStatement stmt2 = conn.prepareStatement(sql);
        stmt2.setString(1, "DJ");
        stmt2.setString(2, "大疆科技公司");
        stmt2.setInt(3, 100);
        stmt2.setString(4, "very well ctd.COr");
        stmt2.setInt(5, 1);

        int count = stmt2.executeUpdate();
        System.out.println(count);
        //释放资源

        stmt2.close();
        conn.close();
    }
}
