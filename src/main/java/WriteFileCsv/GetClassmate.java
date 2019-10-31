package WriteFileCsv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetClassmate {
    Connection conn;
    Statement st;
    public GetClassmate() throws SQLException {
        ConnectDB connectDB = new ConnectDB();
        conn = connectDB.getConnect();
        st = conn.createStatement();
    }
    public static void showClassmate(List<Classmate> classmates){
        int maxLengthName = 0;
        int maxLengthEmail = 0;
        for (Classmate i : classmates){
            if (i.getName().length() > maxLengthName){
                maxLengthName = i.getName().length();
            } if (i.getEmail().length() > maxLengthEmail){
                maxLengthEmail = i.getEmail().length();
            }
        }
        for (int i=0; i<(maxLengthName + maxLengthEmail + 10 + 10); i++){
            System.out.print("-");
        }
        System.out.print("\n");
        for (Classmate i : classmates){
            System.out.print("| ");
            System.out.print(i.getName());
            for (int j = 0; j<(maxLengthName-i.getName().length()); j++){
                System.out.print(" ");
            }
            System.out.print(" | ");
            System.out.print(i.getBirthday());
            System.out.print(" | ");
            System.out.print(i.getEmail());
            for (int j = 0; j<(maxLengthEmail-i.getEmail().length()); j++){
                System.out.print(" ");
            }
            System.out.print(" |\n");
            for (int j=0; j<(maxLengthName + maxLengthEmail + 10 + 10); j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public void Get(){
        try {
            List<Classmate> listclassmate = new ArrayList<>();
            String sql = "select * from classmate";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                Classmate cl = new Classmate();
//                String id = rs.getString("id");
                String name = rs.getString("name");
                cl.setName(name);
                String birthday = rs.getString("birthday");
                cl.setBirthday(birthday);
                String email = rs.getString("email");
                cl.setEmail(email);
//                System.out.println(name + birthday +  email);
                listclassmate.add(cl);
            }
            showClassmate(listclassmate);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
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
        GetClassmate gc = new GetClassmate();
        gc.Get();
    }
}
