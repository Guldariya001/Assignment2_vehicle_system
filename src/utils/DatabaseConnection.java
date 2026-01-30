package utils;

import java.sql.*;
import java.io.InputStream;
import java.util.Scanner;

public class DatabaseConnection {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/librarydb",
                    "username",
                    "password"
            );

            createTablesFromSQL();
        }
        return connection;
    }

    private static void createTablesFromSQL() {
        try {
            Statement statement = connection.createStatement();

            InputStream input = DatabaseConnection.class
                    .getClassLoader()
                    .getResourceAsStream("library_schema.sql");
            Scanner scanner = new Scanner(input).useDelimiter(";");
            while (scanner.hasNext()) {
                String sql = scanner.next().trim();
                if (!sql.isEmpty()) {
                    statement.execute(sql);
                }
            }
            scanner.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

