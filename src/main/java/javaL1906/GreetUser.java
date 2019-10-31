package javaL1906;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        String name;
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhập tên : ");
        name = inp.nextLine();
        System.out.println("Wellcome! " + name);
        inp.close();
    }
}
