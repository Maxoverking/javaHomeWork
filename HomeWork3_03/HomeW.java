package HomeWork3_03;

import java.io.*;

public class HomeW {
    public static void main(String[] args) {
        // Задача 1
        // Написать метод, читающий текстовый файл и возвращающий строку,
        // состояшую из всех прочитанных строчек.
        // Пример: В файле имеется
        // aaa
        // bbbb
        // cc
        // Метод вернет aaa bbbb cc
        String newString = readTextFile("TEST.txt");
        System.out.println("Нам вернулась строка: " + newString);
    }

    public static String readTextFile(String file) {
        String addStr = new String();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                addStr += line + " ";
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return addStr;
    }
}
