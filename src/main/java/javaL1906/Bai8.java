package javaL1906;

import java.util.Date;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Integer year;
        Scanner inp = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        year = inp.nextInt();
        if(year == null){
            year = new Date().getYear();
        }



    }
}
