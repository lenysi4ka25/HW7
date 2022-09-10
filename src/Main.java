public class Main {
    public static void main(String[] args) {
        // Задание 1, задача 1
        System.out.println("Задание 1");
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
        // Задание 1, задача 2
        System.out.println(" ");
        System.out.println("Задание 1");
        System.out.println("Задача 2");
        for (int a = 10; a >= 1; a--)
            System.out.println(a);
        // Задание 1, задача 3
        System.out.println(" ");
        System.out.println("Задание 1");
        System.out.println("Задача 3");
        for (int b = 0; b < 17; b = b + 2)
            System.out.println(b);
        // Задание 1, задача 4
        System.out.println(" ");
        System.out.println("Задание 1");
        System.out.println("Задача 4");
        for (int c = 10; c > -11; c--)
            System.out.println(c);
        // Задание 2, задача 1
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println("Задача 1");
        for (int year = 1904; year <= 2096; year = year + 4)
            System.out.println(year + " год является високосным.");
        // Задание 2, задача 2
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println("Задача 2");
        for (int d = 7; d <= 98; d = d + 7)
            System.out.println(d);
        // Задание 2, задача 3
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println("Задача 3");
        for (int e = 1; e <= 256; e = e * 2)
            System.out.println(e);
        // Задание 3, задача 1
        System.out.println(" ");
        System.out.println("Задание 3");
        System.out.println("Задача 1");
        int monthlyFee = 29000;
        int total = 0;
        for (int f = 1; f < 13; f++) {
            total = total + monthlyFee;
            System.out.println("Месяц " + f + " сумма накоплений равна " + total + " рублей");}
            // Задание 3, задача 2
            System.out.println(" ");
            System.out.println("Задание 3");
            System.out.println("Задача 2");
            int monthlyFeePercent = 29000;
            int totalPercent = 0;
            for (int g = 1; g < 13; g++) {
                totalPercent = totalPercent + monthlyFeePercent;
                totalPercent = totalPercent + totalPercent/100;
                System.out.println("Месяц " + g + " сумма накоплений равна " + totalPercent + " рублей");
    }
}}