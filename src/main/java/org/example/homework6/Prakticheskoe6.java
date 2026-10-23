package org.example.homework6;


public class Prakticheskoe6 {
    public static void main(String[] args) {
        //Объявление строки
        String name = "Tatyana";
        System.out.println(name);
        int result = parseAndPrintNumber("64");
        System.out.println(result);
        System.out.println(isPalindrome("Was it a cat I saw?"));
        System.out.println(isGmailOrOutlook("kata12@gmail.com"));
    }

    //Парсинг числа и деление
    public static int parseAndPrintNumber(String number) {
        int num = Integer.parseInt(number);
        return num / 2;
    }

    //Палиндром
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return text.equalsIgnoreCase(sb.toString()); // true
    }

    //Валидация email через regex
    public static boolean isGmailOrOutlook(String email) {
        if (email == null) {
            return false;
        }
        return email.matches("(?i)[A-Za-z0-9]+@(gmail|outlook)\\.com");
    } //true
}

