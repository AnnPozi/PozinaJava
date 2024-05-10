package Lesson6;

public class Delivery {
    public static void main(String[] args) {
        int customers = 10;
        int routs = 1;

        System.out.print("For this amount of sutomers: " + customers + " we have this amount of different routs with one car: ");

        do {
            routs *= customers--;

        } while (customers > 0);

        System.out.print(routs);
    }
}
