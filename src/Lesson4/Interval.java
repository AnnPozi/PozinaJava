package Lesson4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter any number ");
        double number = s.nextDouble();

        if (number >= 0 && number <=14){
            System.out.println("Number is between 0 and 14");
        }else if(number >= 15 && number <=35){
            System.out.println("Number is between 15 and 35");
        }else if(number >= 36 && number <=50){
            System.out.println("Number is between 36 and 50");
        }else if(number >= 51 && number <=100){
            System.out.println("Number is between 51 and 100");
        } else {
            System.out.println("The number is out of scope");
        }
    }
}
