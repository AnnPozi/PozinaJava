package Lesson7;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, enter your number ");
        int number = scanner.nextInt();
        isPositivNumber(number);
        isSimpleNumber(number);

    }

    public static void isPositivNumber(int number) {
        if (number > 0) {
            System.out.println("You number is positive");
        } else if (number < 0) {
            System.out.println("You number is negative");
        } else {
            System.out.println("your number is 0");
        }
    }

    public static void isSimpleNumber(int number) {
        int check1 = number % 2;
        int check2 = number % 3;
        int check3 = number % 5;
        int check4 = number % 7;
        int check5 = number % 9;
        if (check1 != 0 && check2 != 0 && check3 != 0 && check4 != 0 && check5 != 0) {
            System.out.println("your number is simple");
        } else {
            System.out.println("your number is not simple");
        }
    }

    public static void isDividableNumber(int number) {

    }
}
