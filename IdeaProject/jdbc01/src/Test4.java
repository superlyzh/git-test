import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url ="jdbc:mysql://localhost:3306/test?useUnicode=" +
                "true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC";

        Connection connection = DriverManager.getConnection(url, "root", "1234");

        String sql =  "insert into t_stu (u)";

        PreparedStatement pst = connection.prepareStatement(sql);

        pst.setObject(1,"zs");
        pst.setObject(2,"123");
    }
}
