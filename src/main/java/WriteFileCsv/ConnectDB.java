package WriteFileCsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");  //
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static Connection con = null;
    public static Connection getConnect() throws SQLException {
        if (con != null && con.isClosed()){
            try {
                String url = "jdbc:mysql://localhost:3306/db_classmate" ;
                String user = "root";
                String password = "";
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return con;
    }
}
