package Lesson6;

import java.util.Scanner;

public class Fibanochi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the start number? please,enter: ");
        int first = scanner.nextInt();
        System.out.println("What is the last number? please,enter: ");
        int last = scanner.nextInt();
        int second = first;
        int third;
        System.out.println(first);
        System.out.println(first);
        for (int i = first; i < last; i++) {
            third = first + second;
            first = second;
            second = third;
            System.out.println(third);
        }
    }
}
