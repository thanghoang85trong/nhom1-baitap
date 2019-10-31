package javaL1906;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OrderASC {
    public static void main(String[] args) {
        String s;
        Scanner inp = new Scanner(System.in);
        System.out.print("Nhap chuoi s: ");
        s = inp.nextLine();
        char a[] = s.toCharArray();
        Arrays.sort(a);
        String result = new String(a);
        System.out.println(result);
    }
}
