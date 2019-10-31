package WriteFileCsv;

import java.sql.*;
import java.util.Scanner;
import java.lang.NullPointerException;

public class AddClassmate {
    Connection conn;
    Statement st;
    int rs;
    String name, birthday, email;
    public AddClassmate() throws SQLException {
        conn = ConnectDB.getConnect();
        st = conn.createStatement();
    }
    public void Add(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên: ");
            name = scanner.nextLine();
            System.out.println("Nhập ngày sinh(dd/mm/yyyy): ");
            birthday = scanner.nextLine();
            System.out.println("Nhập email: ");
            email = scanner.nextLine();
            String sql = String.format("INSERT INTO `classmate` (`name`, `birthday`, `email`) VALUES ('%s', '%s', '%s')",
                    name, birthday, email);
            rs = st.executeUpdate(sql);
            System.out.println("Thêm thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (conn != null){
                try {
                    st.close();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        AddClassmate ac = new AddClassmate();
        ac.Add();
    }

}
