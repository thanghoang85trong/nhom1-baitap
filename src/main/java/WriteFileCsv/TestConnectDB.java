package WriteFileCsv;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnectDB {
    public static void main(String[] args) throws SQLException {
        ConnectDB connectDB = new ConnectDB();
        Connection connection = connectDB.getConnect();
//        System.out.println("done!...");
        System.out.println(connection);
        System.out.println("Connection!........");

    }
}
