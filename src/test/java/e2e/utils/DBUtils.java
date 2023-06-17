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

  public static void closeDBConnection() {

      try {
          if (connection != null){
              connection.close();
          }
          if (statement != null) {
              statement.close();
          }
          if (resultSet != null) {
              resultSet.close();
          }
      }catch (SQLException e) {
          throw new RuntimeException(e);
      }
  }

  public static ResultSet runQuery(String query) {
      try {
          statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
          resultSet=statement.executeQuery(query);
      }catch (SQLException e) {
          throw new RuntimeException(e);
      }
      return resultSet;
  }
}
