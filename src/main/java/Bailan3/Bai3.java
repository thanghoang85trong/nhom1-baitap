package Bailan3;

import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập bạn cùng lớp (tên, Sinh nhật, Email),
// xác thực nếu nhập giá trị là định dạng hợp lệ (áp dụng độ dài giới hạn),
// nếu không yêu cầu người dùng nhập lại mỗi trường
public class Bai3 {
    private String ten;
    private String sinhNhat;
    private String email;

    public Bai3(String ten, String sinhNhat, String email) { // ham tao
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
        Bai3 Classmate = new Bai3("", "", "");
        Classmate.inputClassmate();
        Classmate.showClassmate();
    }
}
