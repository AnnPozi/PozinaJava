package Lesson7;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        System.out.println("Please enter second number");
        double secondNumber = scanner.nextDouble();

        System.out.println("What kind of arithmetics do you want to perform? Enter +,-,* or /");
        String operation = scanner.next();
        double res;
        switch (operation){
            case "+":
                 res = add(firstNumber, secondNumber);
                break;
            case "-":
                 res = sub(firstNumber, secondNumber);
                break;
            case "*":
                 res = mul(firstNumber, secondNumber);
                break;
            case "/":
                 res = div(firstNumber, secondNumber);
                break;
            default:
                System.out.println(" The arithmetic operator is wrong!");
                res = 0;
        }
        System.out.println("The result of selected arithmetic operation is " + res);

    }

    public static double add(double firstNumber, double secondNumber){
      double res = firstNumber + secondNumber;
      return res;
    }
    public static double sub(double firstNumber, double secondNumber){
        double res = firstNumber - secondNumber;
        return res;
    }
    public static double mul(double firstNumber, double secondNumber){
        double res = firstNumber * secondNumber;
        return res;
    }
    public static double div(double firstNumber, double secondNumber){
        if (secondNumber == 0){
            System.out.println("It is not possible to divide on 0");
            return 0;
        } else {
            double res = firstNumber / secondNumber;
            return res;
        }

    }
}
