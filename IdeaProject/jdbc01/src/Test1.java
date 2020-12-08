import java.sql.*;

public class Test1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/test?useUnicode=" +
                "true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC";

        String user = "root";

        String password = "1234";

        Connection connection = DriverManager.getConnection(url, user, password);


        Statement statement = connection.createStatement();
        //String sql = "delete from t_stu where id =3";

        String sql2 = "select * from t_stu";
        //int i = statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql2);
        while(resultSet.next()){
            Object o1 = resultSet.getObject(1);
            Object o2 = resultSet.getObject(2);
            Object o3 = resultSet.getObject(3);
            Object o4 = resultSet.getObject(4);
            System.out.println(o1+"--"+o2+"--"+o3+"--"+"--"+o4);
        }

        //System.out.println(i>0?"成功":"失败");
resultSet.close();
        connection.close();
        statement.close();
    }
}
