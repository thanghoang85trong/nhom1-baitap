package Bailan3;
// viet chuong trinh ghi noi dung ra 1 file

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
    try {
        String str1;

        FileOutputStream fos = new FileOutputStream( //tao luong byte xuat du lieu
                "C:\\Users\\84162\\ex4.txt");
        DataOutputStream dos = new DataOutputStream(fos);  // xu ly xuat du lieu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi muon ghi ra file: ");
        str1 = scanner.nextLine();
        dos.writeUTF(str1);
        fos.close();
        dos.close();
    } catch (Exception ex){
        ex.printStackTrace();
    }
    }
}