package Lesson9;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount ");
        int i = scanner.nextInt();
        int[] ar = new int[i];

        for (int j = 0; j < ar.length; j++) {
            ar[j] = j * 10 + i;
        }
       //searching for biggest valuer
        int m = 0;
        for (int j = 0; j < ar.length - 1; j++) {
            if (ar[j] > ar[++j]) {
                m = ar[++j];
            } else {
                m = ar[j];
            }
        }
        System.out.println("The biggest value in array is " + m);

        //searching for smallest valuer
        int min = 0;
        int w = ar[0];
        for (int j = 0; j < ar.length - 1; j++) {
            if (ar[j] < ar[++j]) {
                min = ar[j];
            } else {
                min = ar[++j];
            }
            if (min > w) min = w;
            w = min;
        }
        System.out.println("The smallest value in array is " + min);

        //sum of all values
        int sum = 0;
        for (int j = 0; j < ar.length - 1; j++) {
            sum = sum + ar[j];
        }
        System.out.println("Sum of all values is " + sum);

        //average value  from all values in array

        int av = sum / ar.length;
        System.out.println("The average value is " + av);
    }


}
