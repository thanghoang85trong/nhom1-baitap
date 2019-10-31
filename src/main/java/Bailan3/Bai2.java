package Bailan3;
//doc du lieu thu 1 file

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Bai2 {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\84162\\ex4.txt"); //tao luong doc char
            FileReader fr = new FileReader(f);              // xu ly doc du lieu
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line=br.readLine()) != null) {
                System.out.println(line);
            }
            fr.close();
            br.close();
        } catch (Exception ex){
            System.out.println("Loi doc File" + ex);
        }

    }
}
