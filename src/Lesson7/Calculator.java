package Lesson7;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int one = scanner.nextInt();
        System.out.println("enter second number");
        int two = scanner.nextInt();
        System.out.println("enter third number");
        int three = scanner.nextInt();
        int res = calculator(one, two, three);

        System.out.println("After calculation you get " + res);

    }

    public static int calculator(int a, int b, int c){
       int res = (a + b + c) /3;
       return res;
    }
}
