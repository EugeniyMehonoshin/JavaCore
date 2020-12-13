package Lesson5;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
//    @SuppressWarnings("resource")
//    public static void main(String[] args) throws Exception
//    {
//        CSVReader reader = new CSVReader(new FileReader("test.csv"), ',', '"', 1);
//        List<String[]> allRows = reader.readAll();
//        for(String[] row : allRows){
//            System.out.println(Arrays.toString(row));
//        }
//    }


    public static void main(String[] args) {
        List<List<String>> records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader("test.csv"));) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }





//    public static void main(String[] args) throws Exception
//    {
//
//        CSVReader reader = new CSVReader(new FileReader("test.csv"));
//        String[] nextLine;
//        while ((nextLine = reader.readNext()) != null) {
//            if (nextLine != null) {
//                System.out.println(Arrays.toString(nextLine));
//            }
//        }
//    }

}
