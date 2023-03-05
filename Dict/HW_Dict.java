package Dict;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW_Dict {

    public static void main(String[] args) throws IOException {
        Map<String, String> dictionary = new HashMap<>();

        BufferedReader readFile = new BufferedReader(new FileReader("dict.txt"));
        int n = Integer.parseInt(readFile.readLine());
        for (int i = 0; i < n; i++) {
            String line = readFile.readLine();
            String[] divideLine = line.split(": ");
            dictionary.put(divideLine[0], divideLine[1]);
        }
        readFile.close();

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputWords = new ArrayList<>();
        int m = Integer.parseInt(read.readLine());
        for (int i = 0; i < m; i++) {
            String line = read.readLine();
            inputWords.add(line);
            // if (dictionary.keySet().contains(line)) {
            // System.out.println(dictionary.get(line));
            // }
        }
        read.close();
        System.out.println("ввели" + inputWords);

    }
}