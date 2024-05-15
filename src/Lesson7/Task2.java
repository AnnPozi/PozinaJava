package Lesson7;

public class Task2 {
    public static void main(String[] args) {
        int a = 34;
        int sum = sum(a);
        int mul = mul(a);
        System.out.println("sum = " + sum + " mul = " + mul);

    }

    public static int sum(int a) {
        int b = a / 10;
        int c = a % 10;
        int rest = b + c;
        return rest;
    }

    public static int mul(int a) {
        int b = a / 10;
        int c = a % 10;
        int rest = b * c;
        return rest;
    }

}

//Integer7◦
//
//. Дано двузначное число. Найти сумму и произведение его цифр.
