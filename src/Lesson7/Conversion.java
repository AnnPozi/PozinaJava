package Lesson7;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        String currency = userInputCurrency();
        double amount = userInputAmoubt();
        conversion(currency, amount);
    }

    public static String userInputCurrency() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kinda currency do you have? Enter ");
        System.out.println("*example: EUR, USD, UAH and so on ");
        String currency = scanner.next();
        return currency;
    }

    public static double userInputAmoubt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money would you like to exchange? Enter ");
        System.out.println("*only positive value ");
        double amount = scanner.nextDouble();
        return amount;
    }

    public static void conversion(String currency, double amount) {
        String uah = "UAH";
        String usd = "USD";
        String cny = "CNY";
        String eur = "EUR";
        String gbp = "GBP";
        String pln = "PLN";
        switch (currency){
            case "EUR":
                System.out.println(uah + "=" + amount*42);
                System.out.println(usd + "=" + amount*1.08);
                System.out.println(cny + "=" + amount*7.8);
                System.out.println(gbp + "=" + amount*0.85);
                System.out.println(pln + "=" + amount*4.2);
            case "UAH":
                System.out.println(usd + "=" + amount*0.02);
                System.out.println(cny + "=" + amount*0.18);
                System.out.println(gbp + "=" + amount*0.02);
                System.out.println(pln + "=" + amount*0.099);
            case "USD":
                System.out.println(uah + "=" + amount*42);
                System.out.println(eur + "=" + amount*1.08);
                System.out.println(cny + "=" + amount*7.8);
                System.out.println(gbp + "=" + amount*0.85);
                System.out.println(pln + "=" + amount*4.2);
            case "CNY":
                System.out.println(uah + "=" + amount*42);
                System.out.println(usd + "=" + amount*1.08);
                System.out.println(eur + "=" + amount*7.8);
                System.out.println(gbp + "=" + amount*0.85);
                System.out.println(pln + "=" + amount*4.2);
            case "GBP":
                System.out.println(uah + "=" + amount*42);
                System.out.println(usd + "=" + amount*1.08);
                System.out.println(cny + "=" + amount*7.8);
                System.out.println(eur + "=" + amount*0.85);
                System.out.println(pln + "=" + amount*4.2);
            case "PLN":
                System.out.println(uah + "=" + amount*42);
                System.out.println(usd + "=" + amount*1.08);
                System.out.println(cny + "=" + amount*7.8);
                System.out.println(gbp + "=" + amount*0.85);
                System.out.println(eur + "=" + amount*4.2);
            default:
                System.out.println("We do not know such currency");


        }
    }
}
