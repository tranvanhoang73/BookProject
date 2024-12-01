
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class accessData {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/students";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456789";

    public  Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("error upload driver MySQL");
        }
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}


