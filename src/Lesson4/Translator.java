package Lesson4;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word in Ukrainian. Use lower case letters.");
        String word = s.next();

        switch (word){
            case "погода":
                System.out.println("Translation of the word " + word + " is WEATHER");
                break;
            case "дощ":
                System.out.println("Translation of the word " + word + " is RAIN");
                break;
            case "хмарно":
                System.out.println("Translation of the word " + word + " is CLOUDY");
                break;
            case "соняшно":
                System.out.println("Translation of the word " + word + " is SUNNY");
                break;
            case "мороз":
                System.out.println("Translation of the word " + word + " is FREEZING");
                break;
            case "торнадо":
                System.out.println("Translation of the word " + word + " is TORNADO");
                break;
            case "сніг":
                System.out.println("Translation of the word " + word + " is SNOW");
                break;
            case "вітер":
                System.out.println("Translation of the word " + word + " is WINDY");
                break;
            case "ожеледь":
                System.out.println("Translation of the word " + word + " is SLIPPERY");
                break;
            case "туман":
                System.out.println("Translation of the word " + word + " is FOG");
                break;
            default:
                System.out.println("Sorry, such a word is not in our vocabulary");
        }
    }
}
