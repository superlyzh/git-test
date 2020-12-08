import java.sql.*;

public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url ="jdbc:mysql://localhost:3306/test?useUnicode=" +
                "true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC";

        Connection connection = DriverManager.getConnection(url, "root", "1234");

        String sql =  "select * from t_user where uname = ? and pwd = ?";

        PreparedStatement pst = connection.prepareStatement(sql);

        pst.setObject(1,"zs");
        pst.setObject(2,"123");

        ResultSet resultSet = pst.executeQuery();

        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String password = resultSet.getString(3);

            System.out.println();
        }


        pst.close();
        resultSet.close();
        connection.close();


    }
}
