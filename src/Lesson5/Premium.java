package Lesson5;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        double premium;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Today is a great day because we are preparing premium for every worker in our company. What is your experience? Input here: ");
        double exp = scanner.nextDouble();
        System.out.println("what is your salary? Input here: ");
        double sal = scanner.nextDouble();
        System.out.println("We are gonna calculate your premium.");
        if(exp <10){
            premium = sal*0.1;
        }else if (exp >=5 && exp <10){
            premium = sal*0.15;
        }else if(exp >=10 && exp <15){
            premium = sal*0.25;
        }else if(exp >=15 && exp <20){
            premium = sal*0.35;
        }else if(exp >=20 && exp <25){
            premium = sal*0.45;
        }else if(exp >=25){
            premium = sal*0.5;
        } else {
            premium = 0;
        }
        System.out.println("According to your experience you will get great premium: " + premium + "EUR this year");


    }
}
