package WriteFileCsv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvWriter {
    // Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    // CSV file header
    private static final String FILE_HEADER = "name,birthday,email";
    public static void main(String[] args) {
        String fileName = "C:\\Users\\84162\\classmate0.csv";
        WriteFileCsv(fileName);
    }
    public static void WriteFileCsv(String fileName){
        Scanner scanner = new Scanner(System.in);
        int soluong;
        List<Classmate> listClassmate = new ArrayList<>();
        Classmate clmate = new Classmate();
        System.out.println("Số lượng cần nhập: ");
        soluong = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < soluong; i++) {
            System.out.println("Mời nhập bạn thứ " + (i+1) + " :");
            listClassmate.add(clmate.inputClassmate());
        }
        FileWriter filewriter = null;// khai bao doi tuong de ghi file
        try {
            filewriter = new FileWriter(fileName);// tao doi tuong ghi file và truyen vao file can ghi
            filewriter.append(FILE_HEADER);//ghi tieu de
            filewriter.append(NEW_LINE_SEPARATOR);//xuong dong sau tieu de
            for (Classmate classMate : listClassmate) {
                filewriter.append(classMate.getName());
                filewriter.append(COMMA_DELIMITER);
                filewriter.append(classMate.getBirthday());
                filewriter.append(COMMA_DELIMITER);
                filewriter.append(classMate.getEmail());
                filewriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Done!!!");
        } catch (Exception e) {
            System.out.println("Loi: " + e);
            e.printStackTrace();
        }
        finally{
            try {
                filewriter.flush();
                filewriter.close();
            } catch (IOException e) {
                System.out.println("Loi: " + e);
                e.printStackTrace();
            }
        }
    }
}
