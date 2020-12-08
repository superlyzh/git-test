import org.junit.Test;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url ="jdbc:mysql://localhost:3306/test?useUnicode=" +
                "true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC";

        Connection connection = DriverManager.getConnection(url, "root", "1234");

        String sql = "insert into user values(default,?,?)";

        PreparedStatement pst = connection.prepareStatement(sql);
        InputStream is = new FileInputStream(new File("C:\\Users\\17763\\Desktop\\" +
                "壁纸\\新建文件夹\\新浪-美图控控kong-C181.jpg"));
        pst.setObject(1,"张三");
        pst.setBlob(2,is);
        int i = pst.executeUpdate();
        System.out.println(i>0?"成功":"失败");



        is.close();
        pst.close();
        connection.close();

    }

    @Test
    public void test1(
            Scanner sc =new Scanner(System.in);


    )

}
