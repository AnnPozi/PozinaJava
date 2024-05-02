package Lesson4;

public class Task6 {
    public static void main(String[] args) {
        int number1 = 40;
        int number2 = 600;
        int number3 = 100;

        if (number1 > number2 && number1 > number3){
            System.out.println("the biggest is " + number1);
            if ( number2 > number3){
                System.out.println("The smallest is " + number3);
                System.out.println("The average is " + number2);
            } else {
                System.out.println("The smallest is " + number2);
                System.out.println("The average is " + number3);
            }
        }else if (number2 > number3 && number2 > number1){
            System.out.println("the biggest is " + number2);
            if ( number1 > number3){
                System.out.println("The smallest is " + number3);
                System.out.println("The average is " + number1);
            } else {
                System.out.println("The smallest is " + number1);
                System.out.println("The average is " + number3);
            }
        } else if (number3 > number2 && number3 > number1){
            System.out.println("the biggest is " + number3);
            if ( number1 > number2){
                System.out.println("The smallest is " + number2);
                System.out.println("The average is " + number1);
            } else {
                System.out.println("The smallest is " + number1);
                System.out.println("The average is " + number2);
            }
        }else {
            System.out.println("something is wrong");
        }
    }
}
