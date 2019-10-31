package WriteFileCsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private static final String COMMA_DELIMITER = ","; //
    public static int countLine = 0;

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<String>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    private static void showClassmate(List<String> classmate) {
        int lengthLineMax0 = 0;
        int lengthLineMax1 = 0;
        int lengthLineMax2 = 0;
//        for (int i=0; i<countLine; i++){
//        }


        System.out.println("|-" + classmate.get(0) + "-|-"
                + classmate.get(1) + "-|-" + classmate.get(2) + "-|");
    }

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(
                    "C:\\Users\\84162\\classmate0.csv"));

            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                countLine++;
                showClassmate(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
