package Lesson4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double operand1 = 4000;
        double operand2 = 300;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any operational sign (+,-,*,/)");
        String sign = s.next();
        double result;
        switch (sign) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1/operand2;
                break;
            default:
                System.out.println("Wrong sign was input");
                result = 0;
                break;
        }

        System.out.println("The result is " + result);
    }
}
