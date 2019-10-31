package javaL1906;

import java.net.ServerSocket;
import java.util.Scanner;

public class AliceBob {
    public static void main(String[] args) {
        String str1 = "Bob";
        String str2 = "Alice";
        String name;
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        name = inp.nextLine();
        if(name.equals(str1)==true || name.equals(str2)==true){
            System.out.println("Welcome " + name);
        } else
            System.out.println("Not Welcome");
        inp.close();
    }
}
