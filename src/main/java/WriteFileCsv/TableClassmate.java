package WriteFileCsv;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TableClassmate {
    public static final String COMMA = ",";
    public static void main(String[] args) {
        List<Classmate> listClassmate = new ArrayList<>();
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(
                    "C:\\Users\\84162\\classmate0.csv"));
            //doc tung dong cua file
            while ((line = br.readLine()) != null){
                Classmate classmate = new Classmate();
                classmate.setName(splistString(line).get(0));
                classmate.setBirthday(splistString(line).get(1));
                classmate.setEmail(splistString(line).get(2));
                listClassmate.add(classmate);
//                System.out.println(classmate);
            }
//            System.out.println(listClassmate);
            showClassmate(listClassmate);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public static List<String> splistString(String csvLine){
        List<String> result = new ArrayList<>();
        if (csvLine != null){
            String[] splitData = csvLine.split(COMMA);
            for (int i =0; i<splitData.length; i++){
                result.add(splitData[i]);
            }
        }
        return result;
    }
    public static void showClassmate(List<Classmate> classmates){
        int maxLengthName = 0;
        int maxLengthEmail = 0;
        for (Classmate i : classmates){
            if (i.getName().length() > maxLengthName){
                maxLengthName = i.getName().length();
            } if (i.getEmail().length() > maxLengthEmail){
                maxLengthEmail = i.getEmail().length();
            }
        }
        for (int i=0; i<(maxLengthName + maxLengthEmail + 10 + 10); i++){
            System.out.print("-");
        }
        System.out.print("\n");
        for (Classmate i : classmates){
            System.out.print("| ");
            System.out.print(i.getName());
            for (int j = 0; j<(maxLengthName-i.getName().length()); j++){
                System.out.print(" ");
            }
            System.out.print(" | ");
            System.out.print(i.getBirthday());
            System.out.print(" | ");
            System.out.print(i.getEmail());
            for (int j = 0; j<(maxLengthEmail-i.getEmail().length()); j++){
                System.out.print(" ");
            }
            System.out.print(" |\n");
            for (int j=0; j<(maxLengthName + maxLengthEmail + 10 + 10); j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

