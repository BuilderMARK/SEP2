package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class daoConnection
{
  private static Connection connection;
  protected static Connection getConnection() throws SQLException
  {
    if (connection == null)
    {
      connection = DriverManager
          .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
              "42323087");

    }
    return connection;
  }}