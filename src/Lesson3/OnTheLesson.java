package Lesson3;

import java.util.Scanner;

public class OnTheLesson {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please, input size of the side: ");
        double side = s.nextDouble();
        double volume = Math.pow(side, 3);
        double p = Math.pow(side,2)*6;

        System.out.println("Volume of the square is: " + volume + " and area is: " + p);

    }
}
