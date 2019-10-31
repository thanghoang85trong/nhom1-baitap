package Bailan3;

import java.io.*;

public class Bai5 {
    private static final String COMMA_DELIMITER = ","; //
    public static void printString(String s){
        int n = 20-s.length();
        System.out.print("| ");
        System.out.print(s);
        for (int i =0; i<n; i++){
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {

        try { // sử dụng luồng character,
            File f = new File(
                    "C:\\Users\\84162\\classmate0.csv"); // tạo đối tượng luồng
            FileReader fr = new FileReader(f); // liên kết luồng dữ liệu
            BufferedReader br = new BufferedReader(fr); // Đọc dữ liệu
            String line;
            while ((line = br.readLine()) != null){
                String[] row = line.split(COMMA_DELIMITER);
                for (String r:row){
                    printString(r);
                }
                System.out.print(" |");
                System.out.println("\n");
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Lỗi đọc File !" + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
