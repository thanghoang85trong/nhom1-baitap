package javaL1906;

import java.util.Scanner;

public class TroChoi {
    public static void main(String[] args) {
        int soBiMat = 15;
        int n = 0, dem = 0;
        Scanner inp = new Scanner(System.in);
        while (n!=soBiMat){
            System.out.println("Nhap so ban doan: ");
            n = inp.nextInt();
            if(n > soBiMat){
                System.out.println("So ban nhap qua lon");
                dem+=1;
            } if(n < soBiMat){
                System.out.println("So ban nhap qua nho");
                dem+=1;
            } else {
                System.out.println("Chinh xac");
                System.out.println("So lan thu: " + dem);
            }
        }
    }
}
