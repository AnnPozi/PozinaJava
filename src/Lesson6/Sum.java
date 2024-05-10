package Lesson6;

public class Sum {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int n = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                n = n + a;
                a++;
            }
            System.out.println(n);
        }
    }
}

//    For7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
//        от A до B включительно.
