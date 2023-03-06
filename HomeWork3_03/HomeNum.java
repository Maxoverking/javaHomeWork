package HomeWork3_03;

import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class HomeNum {
    public static void main(String[] args) {
        double result = arifmetic("number.txt");

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.##", symbols);
        System.out.println("Среднее арифметическое " + df.format(result));
    }

    public static Double arifmetic(String fileNumber) {
        double numbers = 0;
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileNumber))) {
            String str;
            while ((str = br.readLine()) != null) {
                numbers += Integer.parseInt(str);
                counter++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        double result = numbers / counter;
        return result;
    }
}
