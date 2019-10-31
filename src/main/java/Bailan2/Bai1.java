package Bailan2;
// viet ham tra ve gia trij lon nhat cua 1 list

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public List<Integer> inputList(List<Integer> list){
        Scanner inp = new Scanner(System.in);
        System.out.print("Nhap cac phan tu cua list, nhan ky tu khac so de dung: ");
        while (inp.hasNextInt()) {
            int i = inp.nextInt();
            list.add(i);
        }
        return list;
    }
    public int getElementLargest(List<Integer> list){
        int max = 0;
        for (int i=0; i<list.size(); i++){
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }
    public void showElementLargest(List<Integer> list){
        inputList(list);
        System.out.println("Danh sách các phần tử là: " + list);
        System.out.println("Phan tu lon nhat la: " + getElementLargest(list));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Bai1 b = new Bai1();
        b.showElementLargest(list);
    }
}
