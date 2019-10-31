package javaL1906;

import java.util.Scanner;

public class TinhTong2 {
    public static void main(String[] args) {
        int n;
        int Tong = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        n = inp.nextInt();
        for(int i = 1; i<=n; i++){
            if(i%3 == 0 || i%5 == 0){
                Tong+=i;
            }
        }
        System.out.println("Tong la: " + Tong);
        inp.close();
    }
}
