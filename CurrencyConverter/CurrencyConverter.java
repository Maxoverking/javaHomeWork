package CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean start = true;
        while (start) {
            String result = convert();
            if (result.equals("Q")) {
                System.out.println("До свидания ;)");
                start = false;
            } else {
                System.out.println("Ваши деньги : " + result);
                scanner.nextLine();
            }
        }
    }

    public static String convert() {
        // курсы валют
        double usdRate = 1.0;
        double eurRate = 0.82;
        double gbpRate = 0.72;
        double rubRate = 73.5;
        // ввод с клавиатуры
        System.out.print("Введите Вашу валюту USD, EUR, GBP,RUB (или 'q' для выхода): ");
        String currency = scanner.nextLine().toUpperCase();

        if (currency.equals("Q")) {
            String finish = "Q";
            return finish;
        }
        System.out.print("Введите валюту, на какую нужно поменять USD, EUR,GBP, RUB: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Сколько " + currency + " поменять на " + targetCurrency + " : ");
        double amount = scanner.nextDouble();
        // конвертация
        double convertedAmount = 0.0;
        switch (currency) {
            case "USD":
                convertedAmount = amount / usdRate;
                break;
            case "EUR":
                convertedAmount = amount / eurRate;
                break;
            case "GBP":
                convertedAmount = amount / gbpRate;
                break;
            case "RUB":
                convertedAmount = amount / rubRate;
                break;
            default:
                System.out.println("Неверная валюта");
                break;
        }
        // Передаю данные дальше
        return convertNext(usdRate, eurRate, gbpRate, rubRate, convertedAmount, targetCurrency);
    }

    public static String convertNext(double usdRate, double eurRate, double gbpRate, double rubRate,
            double convertedAmount, String targetCurrency) {

        switch (targetCurrency) {
            case "USD":
                convertedAmount *= usdRate;
                break;
            case "EUR":
                convertedAmount *= eurRate;
                break;
            case "GBP":
                convertedAmount *= gbpRate;
                break;
            case "RUB":
                convertedAmount *= rubRate;
                break;
            default:
                System.out.println("Неверная валюта");
                break;
        }
        String string = String.format("%.2f", convertedAmount);
        return string + " " + targetCurrency;
    }
}
