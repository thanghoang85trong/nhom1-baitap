package javaL1906;

import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        int n;
        int Tong = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        n = inp.nextInt();
        for(int i=1; i<=n; i++){
            Tong+=i;
        }
        System.out.println("Tong tu 1 den n la: " + Tong);
        inp.close();
    }
}
