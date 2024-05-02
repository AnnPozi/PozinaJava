package Lesson4;

import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number ");
        int number = s.nextInt();
        if (number > 0) {
            number++;
        } else {
            number = number-2;
        }
        System.out.println("Updated number is " + number);
    }
}
