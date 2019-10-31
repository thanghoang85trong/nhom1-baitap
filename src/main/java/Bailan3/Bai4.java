package Bailan3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bai4 {
    private String ten;
    private String sinhNhat;
    private String email;

    public Bai4(String ten, String sinhNhat, String email) { // ham tao
        this.ten = ten;
        this.sinhNhat = sinhNhat;
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSinhNhat() {
        return sinhNhat;
    }

    public void setSinhNhat(String sinhNhat) {
        this.sinhNhat = sinhNhat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputClassmate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String str;
        str = scanner.nextLine();
        while (str.length() > 20){
            System.out.println("Nhap lai ten");
            str = scanner.nextLine();
        }
        setTen(str);
        System.out.println("Nhap ngay sinh: ");
        str = scanner.nextLine();
        while (str.length() > 10){
            System.out.println("Nhap lai ngay sinh: ");
            str = scanner.nextLine();
        }
        setSinhNhat(str);
        System.out.println("Nhap Email: ");
        str = scanner.nextLine();
        while (str.length() > 20){
            System.out.println("Nhap lai email: ");
            str = scanner.nextLine();
        }
        setEmail(str);
    }
    public void showClassmate(){
        System.out.println("Ten: " + getTen());
        System.out.println("Sinh nhat: " + getSinhNhat());
        System.out.println("Email: " + getEmail());
    }

    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhap so ban can them: ");
        n = inp.nextInt();
        Bai4[] Classmate = new Bai4[n];
        for (int i=0; i<n; i++){
            Classmate[i] = new Bai4("", "", "");
            System.out.println("Nhap thong tin ban thu " + (i+1) + " : ");
            Classmate[i].inputClassmate();
        }
        try {
            File f = new File("C:\\Users\\84162\\classmate0.csv");
            FileWriter fw = new FileWriter(f);
            for (int i=0; i<n; i++){
                fw.write(Classmate[i].getTen() + ", " +
                        Classmate[i].getSinhNhat() + ", " +
                        Classmate[i].getEmail() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Loi ghi file" + e);
        }
        System.out.println("Ghi file thành công !");
    }
}
