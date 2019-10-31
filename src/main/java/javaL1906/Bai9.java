package javaL1906;

import java.util.*;

public class Bai9 {
    public static void main(String[] args) {
        Integer year;
        Scanner inp = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        year = inp.nextInt();
        if(year == null){
            year = new Date().getYear();
        }
        List result = new ArrayList();
        while (result.size()<=20){
            if (year%4==0 && year%100 !=0){
                result.add(year);
            }
            year++;
        }
        System.out.println(result);
    }
}
