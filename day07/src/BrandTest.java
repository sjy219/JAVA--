import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BrandTest {


    public static void main(String[] args) throws Exception {
        //注册驱动
        //Class.forName("jdbc.mysql.cj.Driver");

        //连接数据库
        String url = "jdbc:mysql://localhost:3306/example?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
        String user = "root";
        String pass ="root";
        Connection conn = DriverManager.getConnection(url, user, pass);

        //建立查询语句
        /*
        * 1.查询语句
        * 2，参数:无
        * 3.返回值: List<T>
        * */
        String sql = "select * from tb_bran";

        //建立查询对象statement
        PreparedStatement stmt = conn.prepareStatement(sql);
        //建立结果集对象
        //ResultSet rs = stmt.executeQuery();
        ResultSet rs = stmt.executeQuery();
        //遍历结果集

        Brand brand = new Brand();
        List<Brand> brands = new ArrayList<Brand>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getNString("description");
            int status = rs.getInt("status");

            //实例化Brand类对象
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);

            //将brand类对象加入集合当中
            brands.add(brand);

        }
        System.out.println(brands);
        rs.close();
        stmt.close();
        conn.close();

    }
}
