package test20170830;

import java.sql.*;

/**
 * Created by Administrator on 2017/8/30.
 */
public class JdbcTest {
    private  static final String URL = "jdbc:mysql://qfsf0220.win:3306/sspanel";
    private static final String NAME = "root";
    private static final  String PASSWORD = "1234";

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("class add ok");
        } catch (ClassNotFoundException e) {
            System.out.println("a..o...");
            e.printStackTrace();
        }

        Connection con1 = DriverManager.getConnection(URL,NAME,PASSWORD);
        Statement state =con1.createStatement();
        ResultSet rs = state.executeQuery("SELECT  * FROM user  skip 10 limit 10");
        while (rs.next()){
            System.out.print(rs.getInt(1)+"\t");
            System.out.print(rs.getString(2)+"\t");
            System.out.print(rs.getString(3)+"\t");
            System.out.print(rs.getString(4)+"\t");
            System.out.print(rs.getString(5)+"\t");
            System.out.println();

        }
    }

}

