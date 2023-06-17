package e2e.utils;

import java.sql.*;

public class DBUtils {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


  public static void createDbConnection() {
      String dBurl=ConfigReader.getPropertyValue("DBurl");
      String userName=ConfigReader.getPropertyValue("username");
      String password = ConfigReader.getPropertyValue("password");

      try {
          connection= DriverManager.getConnection(dBurl,userName,password);
          System.out.println("DataBase is connected");
      }catch (SQLException e) {
          throw  new RuntimeException(e);
      }
  }
}
