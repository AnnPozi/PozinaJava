package Lesson7;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        double one = 70.3;
        powerA3(one);
        one = 90.3;
        powerA3(one);
        one = 44.0;
        powerA3(one);
        one = 1.3;
        powerA3(one);
        one = 4000.7;
        powerA3(one);
        one = 87665.9876;
        powerA3(one);
    }

    public static double powerA3(double number) {
        double res = Math.pow(number, 3);
        System.out.println(res);
        return res;
    }

}
