package Lesson5;


import com.opencsv.CSVWriter;

import java.io.*;

public class CSVWrite {
    public static void main(String[] args) throws Exception
    {
        String csv = "test.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));
        String [] record = "Value 1,Value 2,Value 3,Value 4,Value 5".split(";");
        writer.writeNext(record);
        writer.close();
        System.out.println();
    }


//    public static void main(String[] args) {
////
////        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tipa.csv"))) {
////            for (int i = 0; i < 5; i++) {
////                writer.write("Java" + ";");
////            }
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////
////        try (BufferedReader reader = new BufferedReader(new FileReader("tipa.csv"))) {
////            String str;
////            while ((str = reader.readLine()) != null) {
////                System.out.println(str);
////            }
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }

}


